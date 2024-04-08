package com.example.learnJDBC.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Libraries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;

    private String name ;
    private String location ;
}
