package com.example.learnJDBC.service;

import com.example.learnJDBC.entity.Books;
import com.example.learnJDBC.repository.BookRepositoryImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class BookService {
    @Autowired
    private BookRepositoryImpl bookRepository ;


    public List<Books>getAllBooks(){

        return bookRepository.getAll();
    }

    public List<Books>getAllBooksInLibrary(Long id){
        log.info("id Library id:"+id);
        return  bookRepository.getAllBookInlibrary(id);
    }

    public Books getBookByIndex (Long id){
        log.info("index:"+id);
        return bookRepository.getBookByIndex(id);
    }

    public Books addBook (Books books){
        log.info("information new Book :"+books);
        return bookRepository.addBook(books);
    }

    public  Books updateBook (Books books , Long id ){
        log.info("info update :"+books+". info id :"+id);
        return bookRepository.updateBooks(books,id);
    }


}
