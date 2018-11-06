package com.example.sombra.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "bookauthor")
public class BookAuthorEntity {
}
