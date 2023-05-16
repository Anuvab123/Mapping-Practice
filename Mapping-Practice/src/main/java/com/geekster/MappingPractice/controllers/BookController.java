package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Book;
import com.geekster.MappingPractice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/save")
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);
    }

    @GetMapping("/getBook")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("/update/{bookId}")
    public void updateBook(@RequestBody Book book, String bookId){
        bookService.updateBook(book,bookId);
    }
}
