package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Book;
import com.geekster.MappingPractice.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public void saveBook(Book book) {
        bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
       return bookRepo.findAll();
    }


    public void updateBook(Book book, String bookId) {
        Book book1=bookRepo.findByBookId(bookId);
        book1.setTitle(book.getTitle());
        book1.setAuthor(book.getAuthor());
        book1.setDescription(book.getDescription());
        book1.setBookPrice(book.getBookPrice());
        bookRepo.save(book1);
    }
}
