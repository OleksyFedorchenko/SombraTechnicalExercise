package com.example.sombra.Repository;

import com.example.sombra.Entity.AuthorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<AuthorsEntity,Long> {
}
