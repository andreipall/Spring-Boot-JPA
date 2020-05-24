package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
    
    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }        

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {            
            
            System.out.println("\nAdd publisher ...");
            bookstoreService.addPublisher();
            
            System.out.println("\nAdd author with books ...");
            bookstoreService.addAuthorsWithBooks();
            
            System.out.println("\nFetch author by name ...");
            bookstoreService.fetchAuthorByName();

            System.out.println("\nRemove a book of an author ...");
            bookstoreService.removeBookOfAuthor();
            
            System.out.println("\nRemove author (and books via cascade) ...");
            bookstoreService.removeAuthor();                       
        };
    }
}
