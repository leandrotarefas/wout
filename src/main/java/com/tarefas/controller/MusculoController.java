package com.tarefas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarefas.model.Musculo;
import com.tarefas.service.MusculoService;

import lombok.var;

@RestController
public class MusculoController {

	@Autowired
	private MusculoService musculoService;
	
	@GetMapping(value = "/musculos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Musculo> grupo() {						
		var musculos = musculoService.listarTodos();
		return musculos;
	}

}
