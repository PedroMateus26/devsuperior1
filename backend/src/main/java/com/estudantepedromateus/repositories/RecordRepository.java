package com.estudantepedromateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudantepedromateus.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
