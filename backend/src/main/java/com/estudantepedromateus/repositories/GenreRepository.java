package com.estudantepedromateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.estudantepedromateus.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

	
}
