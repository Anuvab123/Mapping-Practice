package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,String> {
    Book findByBookId(String bookId);
}
