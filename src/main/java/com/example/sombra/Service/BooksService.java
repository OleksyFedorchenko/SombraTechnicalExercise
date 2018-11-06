package com.example.sombra.Service;

import com.example.sombra.Domain.BooksDTO;

import java.util.List;

public interface BooksService {
        void addBook(BooksDTO book);
        List<BooksDTO> findAllBooks();
        BooksDTO findBookById(Long id);
        void deleteBookById(Long id);
}
