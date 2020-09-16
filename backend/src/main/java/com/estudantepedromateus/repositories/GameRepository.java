package com.estudantepedromateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudantepedromateus.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long>{

}
