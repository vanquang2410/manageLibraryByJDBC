package com.example.learnJDBC.controller;


import com.example.learnJDBC.entity.Books;
import com.example.learnJDBC.repository.BookRepositoryImpl;
import com.example.learnJDBC.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("")
    public ResponseEntity<?>getAll(){
            return ResponseEntity.status(HttpStatus.OK).body(
                    bookService.getAllBooks()
            );

    }

    @GetMapping("/library/{id}")
    public ResponseEntity<?>getAllBookInLibrary(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(
                bookService.getAllBooksInLibrary(id)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>getBooksById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(
                bookService.getBookByIndex(id)
        );
    }

    @PostMapping("")
    public ResponseEntity<?>addBook(@RequestBody Books books){
        return ResponseEntity.status(HttpStatus.OK).body(
                bookService.addBook(books)
        );
    }
    @PutMapping("/{id}")
    public ResponseEntity<?>updateBook(@RequestBody Books books,@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(
               bookService.updateBook(books,id)
        );
    }}
