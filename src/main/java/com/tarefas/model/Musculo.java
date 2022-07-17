package com.tarefas.model;

import java.io.Serializable;

import javax.persistence.Entity;
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
public class Musculo extends Parte implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NonNull
	private Integer min, mid, max; 
	
	@NonNull 
	@ManyToOne
	private GrupoMuscular grupo;

}
