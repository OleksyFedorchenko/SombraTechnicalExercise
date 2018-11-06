package com.example.sombra.Service.Impl;

import com.example.sombra.Domain.BooksDTO;
import com.example.sombra.Entity.BooksEntity;
import com.example.sombra.Repository.BooksRepository;
import com.example.sombra.Service.BooksService;
import com.example.sombra.Utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;
    @Autowired
    private ObjectMapperUtils modelMapper;

    @Override
    public void addBook(BooksDTO book) {
        BooksEntity booksEntity=modelMapper.map(book,BooksEntity.class);
        booksRepository.save(booksEntity);
    }

    @Override
    public List<BooksDTO> findAllBooks() {
        List<BooksEntity> booksEntities=booksRepository.findAll();
        List<BooksDTO> booksDTOS=modelMapper.mapAll(booksEntities,BooksDTO.class);
        return booksDTOS;
    }

    @Override
    public BooksDTO findBookById(Long id) {
        BooksEntity booksEntity=booksRepository.findById(id).get();
        BooksDTO booksDTO=modelMapper.map(booksEntity,BooksDTO.class);
        return booksDTO;
    }

    @Override
    public void deleteBookById(Long id) {
        BooksEntity booksEntity = booksRepository.findById(id).get();
        if (booksEntity != null) {
            booksRepository.deleteById(id);
        } else System.out.println("Book not found");
    }
}
