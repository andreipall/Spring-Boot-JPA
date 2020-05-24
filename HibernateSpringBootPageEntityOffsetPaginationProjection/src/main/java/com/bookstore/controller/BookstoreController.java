package com.bookstore.controller;

import com.bookstore.projection.AuthorInfo;
import com.bookstore.service.BookstoreService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookstoreController {

    private final BookstoreService bookstoreService;

    public BookstoreController(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @GetMapping("/authors/{page}/{size}")
    public Page<AuthorInfo> fetchAuthors(@PathVariable int page, @PathVariable int size) {

        return bookstoreService.fetchNextPage(page, size);
    }

}
