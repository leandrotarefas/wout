package com.tarefas.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarefas.model.Musculo;
import com.tarefas.repository.MusculoRepository;

import lombok.var;

@Service
@Transactional
public class MusculoService implements WoutService<Musculo> {

	@Autowired
	private MusculoRepository musculoRepository;

	@Override
	public List<Musculo> listarTodos() {
		var todos = musculoRepository.findAll();
		List<Musculo> list = StreamSupport.stream(todos.spliterator(), false).collect(Collectors.toList());
		return list;
	}
	
	public Musculo salvar(Musculo musculo) {
		var salvo = musculoRepository.save(musculo);
		return salvo;
	}

	@Override
	public List<Musculo> salvarTodos(List<Musculo> lista) {
		var salvos = musculoRepository.saveAll(lista);
		List<Musculo> list = StreamSupport.stream(salvos.spliterator(), false).collect(Collectors.toList());
		return list;
	}

}
