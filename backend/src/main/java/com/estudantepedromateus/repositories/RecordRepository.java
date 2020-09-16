package com.estudantepedromateus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudantepedromateus.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
