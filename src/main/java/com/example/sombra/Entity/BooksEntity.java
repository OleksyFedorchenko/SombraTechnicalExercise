package com.example.sombra.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "books")
public class BooksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    private LocalDate published;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private int rating;
}
