package com.example.sombra.Service;

import com.example.sombra.Domain.AuthorsDTO;

import java.util.List;

public interface AuthorsService {
    void addAuthor(AuthorsDTO author);
    List<AuthorsDTO> findAllAuthors();
    AuthorsDTO findAuthorById(Long id);
    void deleteAuthorById(Long id);
}
