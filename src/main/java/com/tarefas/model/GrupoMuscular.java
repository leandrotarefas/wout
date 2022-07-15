package com.tarefas.model;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;



@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
@Entity
public class GrupoMuscular extends Parte implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GrupoMuscular() {
		
	}
	
}
