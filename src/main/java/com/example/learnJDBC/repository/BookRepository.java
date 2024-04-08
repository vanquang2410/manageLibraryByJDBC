package com.example.learnJDBC.repository;

import com.example.learnJDBC.entity.Books;


import java.util.List;

public interface BookRepository  {
    List<Books>getAll();

    List<Books>getAllBookInlibrary(Long id);

    Books getBookByIndex (Long id);

    Books addBook (Books books);

    Books updateBooks (Books books,Long id );


}
