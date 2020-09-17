package com.estudantepedromateus.services;

import java.time.Instant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudantepedromateus.dto.RecordDTO;
import com.estudantepedromateus.dto.RecordInsertDTO;
import com.estudantepedromateus.entities.Game;
import com.estudantepedromateus.entities.Record;
import com.estudantepedromateus.repositories.GameRepository;
import com.estudantepedromateus.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	public RecordRepository recordRepository;
	
	@Autowired
	public GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity= new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game=gameRepository.getOne(dto.getGameId());
		
		entity.setGame(game);
		
		entity=recordRepository.save(entity);
		
		return new RecordDTO(entity);
		
		
	}

	public Page<RecordDTO> findByMoment(Instant minDate,Instant maxDate, PageRequest pageRequest) {
		return recordRepository.findByMoment(minDate, maxDate, pageRequest).map(x->new RecordDTO(x));
	}
}
