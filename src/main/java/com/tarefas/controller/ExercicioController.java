package com.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefas.model.Exercicio;
import com.tarefas.service.ExercicioService;

import lombok.var;

@RestController
public class ExercicioController {

	@Autowired
	private ExercicioService exercicioService;
	
	@GetMapping(value = "/exercicios", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Exercicio> grupo() {		
		var gruposMusculares = exercicioService.listarTodos();		
		return gruposMusculares;
	}

}
