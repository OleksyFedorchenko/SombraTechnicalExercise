package com.example.sombra.Service.Impl;

import com.example.sombra.Domain.AuthorsDTO;
import com.example.sombra.Entity.AuthorsEntity;
import com.example.sombra.Repository.AuthorsRepository;
import com.example.sombra.Service.AuthorsService;
import com.example.sombra.Utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService {
@Autowired
private AuthorsRepository authorsRepository;
@Autowired
private ObjectMapperUtils modelMapper;

    @Override
    public void addAuthor(AuthorsDTO author) {
        AuthorsEntity authorsEntity=modelMapper.map(author,AuthorsEntity.class);
        authorsRepository.save(authorsEntity);
    }

    @Override
    public List<AuthorsDTO> findAllAuthors() {
        List<AuthorsEntity> authorsEntities=authorsRepository.findAll();
        List<AuthorsDTO> authorsDTOS=modelMapper.mapAll(authorsEntities,AuthorsDTO.class);
        return authorsDTOS;
    }

    @Override
    public AuthorsDTO findAuthorById(Long id) {
        AuthorsEntity authorsEntity=authorsRepository.findById(id).get();
        AuthorsDTO authorsDTO=modelMapper.map(authorsEntity,AuthorsDTO.class);
        return authorsDTO;
    }

    @Override
    public void deleteAuthorById(Long id) {
        AuthorsEntity authorsEntity = authorsRepository.findById(id).get();
        if (authorsEntity != null) {
            authorsRepository.deleteById(id);
        } else System.out.println("Author not found");
    }
}
