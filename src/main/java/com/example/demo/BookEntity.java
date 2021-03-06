package com.example.demo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.*;

@Entity
@Table(name = "books")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookEntity
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "author")
    private String author;


}