package com.bookstore.repository;

import com.bookstore.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
    @Transactional(readOnly=true)
    @Query("SELECT b FROM Book b ORDER BY RAND()")
    public List<Book> fetchOrderByRnd();
}
