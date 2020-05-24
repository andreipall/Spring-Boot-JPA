package com.bookstore.service;

import com.bookstore.entity.Chapter;
import com.bookstore.entity.Modification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import com.bookstore.repository.ChapterRepository;
import com.bookstore.repository.ModificationRepository;

@Service
public class BookstoreService {

    private static final Logger log = Logger.getLogger(BookstoreService.class.getName());

    private final TransactionTemplate template;
    private final ChapterRepository chapterRepository;
    private final ModificationRepository modificationRepository;
    private final EntityManager entityManager;

    public BookstoreService(ChapterRepository chapterRepository,
            ModificationRepository modificationRepository,
            TransactionTemplate template, EntityManager entityManager) {
        this.chapterRepository = chapterRepository;
        this.modificationRepository = modificationRepository;
        this.template = template;
        this.entityManager = entityManager;
    }

    // For all dialects (MySQL5Dialect, MySQL5InnoDBDialect, MySQL8Dialect)            
    // running the below method will throw: javax.persistence.OptimisticLockException
    // Caused by: org.hibernate.StaleObjectStateException:
    public void editChapterTestVersion() {
        template.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);

        template.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {

                log.info("Starting first transaction (no physical or logical lock) ...");

                Chapter chapter = chapterRepository.findByTitle("Locking");

                template.execute(new TransactionCallbackWithoutResult() {
                    @Override
                    protected void doInTransactionWithoutResult(TransactionStatus status) {

                        log.info("Starting second transaction ...");

                        Chapter chapter = chapterRepository.findById(1L).orElseThrow();

                        Modification modification = new Modification();
                        modification.setDescription("Formatting second paragraph");
                        modification.setModification("Format ...");
                        modification.setChapter(chapter);

                        modificationRepository.save(modification);

                        log.info("Commit second transaction ...");
                    }
                });

                log.info("Resuming first transaction ...");
                
                log.info("First transaction attempts to acquire a "
                        + "PESSIMISTIC_FORCE_INCREMENT on the existing `chapter` entity");
                entityManager.lock(chapter, LockModeType.PESSIMISTIC_FORCE_INCREMENT);

                Modification modification = new Modification();
                modification.setDescription("Rewording first paragraph");
                modification.setModification("Reword: ... Added: ...");
                modification.setChapter(chapter);

                modificationRepository.save(modification);

                log.info("Commit first transaction ...");
            }
        });

        log.info("Done!");
    }

    // For MySQL5Dialect (MyISAM) stoare engine): row-level locking not supported
    // For MySQL5InnoDBDialect (InnoDB storage engine): row-level locking is aquired via FOR UPDATE
    // For MySQL8Dialect (InnoDB storage engine): row-level locking is aquired via FOR UPDATE NOWAIT
    // running the below method will throw: org.hibernate.QueryTimeoutException
    // Caused by: com.mysql.cj.jdbc.exceptions.MySQLTimeoutException
    public void editChapterTestLocking() {
        template.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        template.setTimeout(3); // 3 seconds

        template.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {

                log.info("Starting first transaction ...");

                Chapter chapter = chapterRepository.findById(1L).orElseThrow();

                Modification modification = new Modification();
                modification.setDescription("Rewording first paragraph");
                modification.setModification("Reword: ... Added: ...");
                modification.setChapter(chapter);

                template.execute(new TransactionCallbackWithoutResult() {
                    @Override
                    protected void doInTransactionWithoutResult(TransactionStatus status) {

                        log.info("Starting second transaction ...");

                        Chapter chapter = chapterRepository.findById(1L).orElseThrow();

                        Modification modification = new Modification();
                        modification.setDescription("Formatting second paragraph");
                        modification.setModification("Format ...");
                        modification.setChapter(chapter);

                        modificationRepository.save(modification);

                        log.info("Commit second transaction ...");
                    }
                });

                log.info("Resuming first transaction ...");
                
                modificationRepository.save(modification);

                log.info("Commit first transaction ...");
            }
        });

        log.info("Done!");
    }
}
