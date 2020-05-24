package com.bookstore.service;

import com.bookstore.dto.AuthorDto;
import com.bookstore.dto.AuthorNicknameAndAge;
import com.bookstore.entity.Author;
import com.bookstore.repository.AuthorRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void fetchAnthologyAuthors() {
        List<Author> authors = authorRepository.fetchByGenre("Anthology");
        System.out.println("Result: " + authors);
    }

    public void fetchAnthologyAuthorsNameAndAgeDto() {
        List<Object[]> authorsArray = authorRepository.fetchNicknameAndAgeByGenreDto("Anthology");
        List<AuthorDto> authors = authorsArray.stream()
                .map(result -> new AuthorDto(
                (String) result[0],
                (Integer) result[1]
        )).collect(Collectors.toList());

        System.out.println("Result: " + authors);
    }

    public void fetchAnthologyAuthorsNameAndAgeProj() {
        List<AuthorNicknameAndAge> authorsDto
                = authorRepository.fetchNicknameAndAgeByGenreProj("Anthology");

        System.out.println("Result: ");
        authorsDto.forEach(a -> System.out.println(a.getNickname() + ", " + a.getAge()));
    }
}
