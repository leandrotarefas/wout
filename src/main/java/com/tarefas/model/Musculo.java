package com.tarefas.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Musculo extends Parte {
	
	@NonNull
	private Integer min, mid, max; 
	
	@NonNull 
	@ManyToOne
	private GrupoMuscular grupo;

	//quem é o dono do relacionamento
	@ManyToMany(mappedBy = "musculos")
	private Set<Exercicio> exercicios;
	
	
	
}
