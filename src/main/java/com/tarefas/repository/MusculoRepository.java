package com.tarefas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.model.Musculo;

@Repository
public interface MusculoRepository extends CrudRepository<Musculo, Long> {

}
