package com.example.learnJDBC.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAuthor {
    @Id
    private Long bookId;
    @Id
    private Long libraryId;
}
