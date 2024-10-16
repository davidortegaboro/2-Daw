package com.libreria.david.controller.admin;

import com.libreria.david.controller.admin.webModel.book.BookCollection;
import com.libreria.david.controller.admin.webModel.book.BookDetails;
import com.libreria.david.controller.admin.webModel.book.BookMapper;
import com.libreria.david.domain.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookAdminController {

    private BookService bookService;
    @Autowired
    public BookAdminController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/api/admin/books")
    public ResponseEntity<List<BookCollection>> findAll(){
        List<BookCollection> bookCollectionList = bookService.findAll().stream().map(BookMapper.INSTANCE::toBookCollection).toList();
        return new ResponseEntity<>(bookCollectionList, HttpStatus.OK);
    }

    @GetMapping("/api/admin/books/{isbn}")
    public ResponseEntity<BookDetails> findByIsbn(@PathVariable String isbn){
        BookDetails bookDetails = BookMapper.INSTANCE.toBookDetails(bookService.findByIsbn(isbn));
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }

}