package com.tarefas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.model.GrupoMuscular;

@Repository
public interface GrupoMuscularRepository extends CrudRepository<GrupoMuscular, Long> {

}
