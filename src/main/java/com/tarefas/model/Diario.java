package com.tarefas.model;

import java.util.Date;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Diario {

	private Long id;
	@NonNull
	private Date dataHora;
	@NonNull
	private Integer repeticoes , quantidade;
	@NonNull
	private Exercicio exercicio;
	
}
