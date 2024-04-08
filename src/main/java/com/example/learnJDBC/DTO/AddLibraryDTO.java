package com.example.learnJDBC.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddLibraryDTO {
    private String name ;
    private String location ;

    private List<Long> BooksAlreadyExists;
}
