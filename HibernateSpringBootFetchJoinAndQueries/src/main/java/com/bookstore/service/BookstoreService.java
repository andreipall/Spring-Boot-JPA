package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepositoryEntityGraph;
import static com.bookstore.specs.BookSpecs.isPriceGt35;
import java.util.List;
import org.springframework.stereotype.Service;
import com.bookstore.repository.BookRepositoryJoinFetch;
import com.bookstore.repository.BookRepositoryFetchModeJoin;

@Service
public class BookstoreService {

    private final BookRepositoryFetchModeJoin bookRepositoryFetchModeJoin;
    private final BookRepositoryEntityGraph bookRepositoryEntityGraph;
    private final BookRepositoryJoinFetch bookRepositoryJoinFetch;

    public BookstoreService(BookRepositoryFetchModeJoin bookRepositoryFetchModeJoin,
            BookRepositoryEntityGraph bookRepositoryEntityGraph,
            BookRepositoryJoinFetch bookRepositoryJoinFetch) {

        this.bookRepositoryFetchModeJoin = bookRepositoryFetchModeJoin;
        this.bookRepositoryEntityGraph = bookRepositoryEntityGraph;
        this.bookRepositoryJoinFetch = bookRepositoryJoinFetch;
    }

    public void displayBookById() {

        Book book = bookRepositoryFetchModeJoin.findById(1L).orElseThrow(); // LEFT JOIN
        displayBook(book);
    }
    
    public void displayBookByIdViaJoinFetch() {

        Book book = bookRepositoryJoinFetch.findById(1L).orElseThrow(); // LEFT JOIN
        displayBook(book);
    }
    
    public void displayBookByIdViaEntityGraph() {

        Book book = bookRepositoryEntityGraph.findById(1L).orElseThrow(); // LEFT JOIN
        displayBook(book);
    }

    public void displayBooksCausingNPlus1() {

        List<Book> books = bookRepositoryFetchModeJoin.findAll(); // N+1         
        displayBooks(books);
    }

    public void displayBooksByAgeGt45CausingNPlus1() {

        List<Book> books = bookRepositoryFetchModeJoin.findAll(isPriceGt35()); // N+1         
        displayBooks(books);
    }   
    
    public void displayBooksViaEntityGraph() {

        List<Book> books = bookRepositoryEntityGraph.findAll(); // LEFT JOIN
        displayBooks(books);
    }

    public void displayBooksByAgeGt45ViaEntityGraph() {

        List<Book> books = bookRepositoryEntityGraph.findAll(isPriceGt35()); // LEFT JOIN
        displayBooks(books);
    }
    
    public void displayBooksViaJoinFetch() {

        List<Book> books = bookRepositoryJoinFetch.findAll(); // LEFT JOIN
        displayBooks(books);
    }       

    private void displayBook(Book book) {

        System.out.println(book);
        System.out.println(book.getAuthor());
        System.out.println(book.getAuthor().getPublisher() + "\n");
    }

    private void displayBooks(List<Book> books) {

        for (Book book : books) {
            System.out.println(book);
            System.out.println(book.getAuthor());
            System.out.println(book.getAuthor().getPublisher() + "\n");
        }
    }
}
