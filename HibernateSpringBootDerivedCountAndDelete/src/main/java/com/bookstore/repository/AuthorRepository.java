package com.bookstore.repository;

import com.bookstore.entity.Author;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface AuthorRepository extends JpaRepository<Author, Long> {

    long countByGenre(String genre);
    
    @Transactional
    long deleteByGenre(String genre);
    
    @Transactional
    List<Author> removeByGenre(String genre);
}
