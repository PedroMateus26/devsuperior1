package com.estudantepedromateus.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudantepedromateus.dto.GameDTO;
import com.estudantepedromateus.entities.Game;
import com.estudantepedromateus.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	public GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> list = gameRepository.findAll();
		return list.stream().map(x->new GameDTO(x)).collect(Collectors.toList());
	}
}
