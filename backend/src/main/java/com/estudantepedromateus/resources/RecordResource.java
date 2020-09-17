package com.estudantepedromateus.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudantepedromateus.dto.RecordDTO;
import com.estudantepedromateus.dto.RecordInsertDTO;
import com.estudantepedromateus.services.RecordService;



@RestController
@RequestMapping(value = "/records")
public class RecordResource {

	@Autowired
	public RecordService recordService;

	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto) {
		RecordDTO newDTO=recordService.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
}
