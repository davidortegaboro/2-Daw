package com.david.libreria.controller;

import com.david.libreria.controller.model.book.BookColletion;
import com.david.libreria.controller.model.book.BookDetail;
import com.david.libreria.controller.model.book.BookMapper;
import com.david.libreria.domain.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/books")
    public ResponseEntity<List<BookColletion>> getAll(){
        List<BookColletion> bookColletions = bookService.getAll().
                stream().
                map(BookMapper.INSTANCE::toBookCollection).
                toList();

        return new ResponseEntity<>( bookColletions, HttpStatus.OK);
    }

    @GetMapping("/api/books/{isbn}")
    ResponseEntity<BookDetail> findByIsbn(@PathVariable String isbn){
        BookDetail bookDetail = BookMapper.INSTANCE.toBookDetail(bookService.findByIsb(isbn));

        return new ResponseEntity<>(bookDetail, HttpStatus.OK);
    }
}
