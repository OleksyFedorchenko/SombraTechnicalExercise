package com.example.sombra.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class BooksDTO {
    private Long id;
    private String name;
    private LocalDate published;
    private String genre;
    private int rating;
}
