package com.tarefas.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarefas.model.GrupoMuscular;
import com.tarefas.repository.GrupoMuscularRepository;

import lombok.var;

@Service
@Transactional
public class GrupoMuscularService implements WoutService<GrupoMuscular> {
	
	@Autowired
	private GrupoMuscularRepository grupoMuscularRepository;

	@Override
	public List<GrupoMuscular> listarTodos() {
		var todos  = grupoMuscularRepository.findAll();
		return (List<GrupoMuscular>) todos;
	}

	@Override
	public List<GrupoMuscular> salvarTodos(List<GrupoMuscular> lista) {
		var salvos  = grupoMuscularRepository.saveAll(lista);
		List<GrupoMuscular> list = StreamSupport.stream(salvos.spliterator(), false)
	    .collect(Collectors.toList());
		return list;
	}

}
