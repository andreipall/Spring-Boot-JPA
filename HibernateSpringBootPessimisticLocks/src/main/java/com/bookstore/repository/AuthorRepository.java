package com.bookstore.repository;

import com.bookstore.entity.Author;
import java.util.Optional;
import javax.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Override
    @Lock(LockModeType.PESSIMISTIC_READ) // for exclusive lock switch to PESSIMISTIC_WRITE
    public Optional<Author> findById(Long id);
}
