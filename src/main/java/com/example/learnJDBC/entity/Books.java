package com.example.learnJDBC.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;

    private  String code;

    private  String name ;

    private String category;

}
