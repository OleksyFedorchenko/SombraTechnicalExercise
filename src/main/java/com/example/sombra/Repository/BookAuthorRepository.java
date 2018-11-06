package com.example.sombra.Repository;

import com.example.sombra.Entity.BookAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthorEntity,Long> {
}
