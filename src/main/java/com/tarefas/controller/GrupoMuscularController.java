package com.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefas.model.GrupoMuscular;
import com.tarefas.service.GrupoMuscularService;

import lombok.var;

@RestController
public class GrupoMuscularController {

	@Autowired
	private GrupoMuscularService grupoMuscularService;
	
	@GetMapping(value = "/grupos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GrupoMuscular> grupo() {		
		var gruposMusculares = grupoMuscularService.listarTodos();		
		return gruposMusculares;
	}

}
