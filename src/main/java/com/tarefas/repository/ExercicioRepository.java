package com.tarefas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.model.Exercicio;

@Repository
public interface ExercicioRepository extends CrudRepository<Exercicio, Long> {

}
