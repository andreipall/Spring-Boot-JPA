package com.bookstore.controller;

import com.bookstore.dto.AuthorDto;
import com.bookstore.service.BookstoreService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreController {

    private final BookstoreService bookstoreService;

    public BookstoreController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @GetMapping("/native/authors/{page}/{size}")
    public List<AuthorDto> fetchAuthorsNative(@PathVariable int page, @PathVariable int size) {

        return bookstoreService.fetchNextPageNative(page, size);
    }

    @GetMapping("/jpql/authors/{page}/{size}")
    public List<AuthorDto> fetchAuthorsJpql(@PathVariable int page, @PathVariable int size) {

        return bookstoreService.fetchNextPageJpql(page, size);
    }
}
