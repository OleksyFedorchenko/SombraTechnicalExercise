package com.example.sombra.Domain;

import com.example.sombra.Enum.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class AuthorsDTO {
    private Long id;
    private Gender gender;
    private LocalDate born;
}
