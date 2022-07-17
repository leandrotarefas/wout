package com.tarefas.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarefas.model.Exercicio;
import com.tarefas.repository.ExercicioRepository;

import lombok.var;

@Service
@Transactional
public class ExercicioService implements WoutService<Exercicio> {

	@Autowired
	private ExercicioRepository exercicioRepository;

	@Override
	public List<Exercicio> listarTodos() {
		var todos  = exercicioRepository.findAll();
		List<Exercicio> list = StreamSupport.stream(todos.spliterator(), false).collect(Collectors.toList());
		return list;
	}

	@Override
	public List<Exercicio> salvarTodos(List<Exercicio> lista) {
		var salvos  = exercicioRepository.saveAll(lista);
		List<Exercicio> list = StreamSupport.stream(salvos.spliterator(), false).collect(Collectors.toList());
		return list;
	}
	
	
	public Exercicio salvar(Exercicio exercicio) {
		var salvo  = exercicioRepository.save(exercicio);
		return salvo;
	}

}
