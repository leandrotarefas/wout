package com.tarefas.service;

import java.util.List;

public interface WoutService<T>{	
	
	public List<T> listarTodos();
	public List<T> salvarTodos(List<T> lista);

}
