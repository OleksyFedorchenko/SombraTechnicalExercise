package com.example.sombra.Controller;

import com.example.sombra.Domain.BooksDTO;
import com.example.sombra.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody BooksDTO booksDTO){
        booksService.addBook(booksDTO);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
