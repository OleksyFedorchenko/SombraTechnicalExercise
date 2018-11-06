package com.example.sombra.Entity;

import com.example.sombra.Enum.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="authors")
public class AuthorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate born;

}
