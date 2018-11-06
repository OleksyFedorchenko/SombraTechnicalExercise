package com.example.sombra.Repository;

import com.example.sombra.Entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<BooksEntity,Long> {
}
