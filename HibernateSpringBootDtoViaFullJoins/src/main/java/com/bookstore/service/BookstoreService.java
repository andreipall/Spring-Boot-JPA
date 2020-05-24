package com.bookstore.service;

import com.bookstore.projection.AuthorNameBookTitle;
import com.bookstore.repository.AuthorRepository;
import com.bookstore.repository.BookRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookstoreService(AuthorRepository authorRepository,
            BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    // Fetch books and authors including authors that have no registered books and books with no registered authors (JPQL)    
    public List<AuthorNameBookTitle> fetchBooksAndAuthorsJpql() {
        return bookRepository.findBooksAndAuthorsJpql();
    }

    // Fetch books and authors including authors that have no registered books and books with no registered authors (SQL)    
    public List<AuthorNameBookTitle> fetchBooksAndAuthorsSql() {
        return bookRepository.findBooksAndAuthorsSql();
    }

    // Fetch authors and books including authors that have no registered books and books with no registered authors (JPQL)    
    public List<AuthorNameBookTitle> fetchAuthorsAndBooksJpql() {
        return authorRepository.findAuthorsAndBooksJpql();
    }

    // Fetch authors and books including authors that have no registered books and books with no registered authors (SQL)    
    public List<AuthorNameBookTitle> fetchAuthorsAndBooksSql() {
        return authorRepository.findAuthorsAndBooksSql();
    }
}
