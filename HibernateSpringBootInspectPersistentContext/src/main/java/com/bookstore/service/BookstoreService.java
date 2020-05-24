package com.bookstore.service;

import com.bookstore.entity.Author;
import com.bookstore.entity.Book;
import com.bookstore.repository.AuthorRepository;
import java.util.Arrays;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookstoreService {

    @PersistenceContext
    private final EntityManager entityManager;
    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository, EntityManager entityManager) {

        this.authorRepository = authorRepository;
        this.entityManager = entityManager;
    }

    @Transactional
    public void sqlOperations() {
        briefOverviewOfPersistentContextContent();

        Author author = authorRepository.findByName("Joana Nimar");

        briefOverviewOfPersistentContextContent();

        author.getBooks().get(0).setIsbn("not available");
        briefOverviewOfPersistentContextContent();

        authorRepository.delete(author);
        authorRepository.flush();
        briefOverviewOfPersistentContextContent();

        Author newAuthor = new Author();
        newAuthor.setName("Alicia Tom");
        newAuthor.setAge(38);
        newAuthor.setGenre("Anthology");

        Book book = new Book();
        book.setIsbn("001-AT");
        book.setTitle("The book of swords");

        newAuthor.addBook(book); // use addBook() helper

        authorRepository.saveAndFlush(newAuthor);
        briefOverviewOfPersistentContextContent();
    }

    private void briefOverviewOfPersistentContextContent() {

        System.out.println("\n-----------------------------------------------------");

        org.hibernate.engine.spi.PersistenceContext persistenceContext = getPersistenceContext();

        int managedEntities = persistenceContext.getNumberOfManagedEntities();
        int collectionEntriesSize = persistenceContext.getCollectionEntriesSize();
        
        System.out.println("Total number of managed entities: "
                + managedEntities);
        System.out.println("Total number of collection entries: "
                + collectionEntriesSize);

        // getEntitiesByKey() will be removed and probably replaced with #iterateEntities() 
        Map<EntityKey, Object> entitiesByKey = persistenceContext.getEntitiesByKey();        

        if (!entitiesByKey.isEmpty()) {
            System.out.println("\nEntities by key:");
            entitiesByKey.forEach((key, value) -> System.out.println(key + ": " + value));

            System.out.println("\nStatus and hydrated state:");
            for (Object entry : entitiesByKey.values()) {
                EntityEntry ee = persistenceContext.getEntry(entry);
                System.out.println(
                        "Entity name: " + ee.getEntityName()
                        + " | Status: " + ee.getStatus()
                        + " | State: " + Arrays.toString(ee.getLoadedState()));
            }
        }

        if (collectionEntriesSize > 0) {
            System.out.println("\nCollection entries:");
            persistenceContext.forEachCollectionEntry(
                    (k, v) -> System.out.println("Key:" + k
                            + ", Value:" + (v.getRole() == null ? "" : v)), false);
        }
        System.out.println("-----------------------------------------------------\n");
    }

    private org.hibernate.engine.spi.PersistenceContext getPersistenceContext() {

        SharedSessionContractImplementor sharedSession = entityManager.unwrap(
                SharedSessionContractImplementor.class
        );

        return sharedSession.getPersistenceContext();
    }
}
