package com.tarefas.config;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Configuration;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.tarefas.model.Exercicio;
import com.tarefas.model.GrupoMuscular;
import com.tarefas.model.Musculo;
import com.tarefas.service.ExercicioService;
import com.tarefas.service.GrupoMuscularService;
import com.tarefas.service.MusculoService;

import lombok.var;

@Configuration
public class DadosConfiguration {

	private GrupoMuscularService grupoMuscularService;
	private MusculoService musculoService;
	private ExercicioService exercicioService;
	
	private void loadData() {

		GrupoMuscular pernas = GrupoMuscular.builder().nome("pernas").build();
		GrupoMuscular bracos = GrupoMuscular.builder().nome("bracos").build();
		GrupoMuscular peito = GrupoMuscular.builder().nome("peito").build();
		GrupoMuscular costas = GrupoMuscular.builder().nome("costas").build();
		var gruposMusculares = Arrays.asList(pernas, peito, costas, bracos);		
	
		grupoMuscularService.salvarTodos(gruposMusculares);		
				
		Musculo posterior = Musculo.builder().nome("posterior").min(110).mid(120).max(130).grupo(pernas).build();
		Musculo quadriceps = Musculo.builder().nome("quadriceps").min(120).mid(130).max(140).grupo(pernas).build();
		musculoService.salvarTodos(Arrays.asList(posterior,quadriceps));
		
		var musculosParaAgachamento = Arrays.asList(posterior, quadriceps);			
		var agachamento = Exercicio.builder().nome("agachamento").min(30).mid(40).max(50).musculos(musculosParaAgachamento).build();
		exercicioService.salvar(agachamento);
			
		Musculo biceps = Musculo.builder().nome("biceps").min(50).mid(70).max(80).grupo(bracos).build();
		musculoService.salvar(biceps);	
		
		var rosca = Exercicio.builder().nome("rosca").min(30).mid(40).max(50).build();
		rosca.add(biceps);		
		exercicioService.salvar(rosca);
	}

	public DadosConfiguration(GrupoMuscularService grupoMuscularService, MusculoService musculoService, ExercicioService exercicioService) {
		this.grupoMuscularService = grupoMuscularService;
		this.musculoService = musculoService;
		this.exercicioService = exercicioService;
		loadData();
	}

}
