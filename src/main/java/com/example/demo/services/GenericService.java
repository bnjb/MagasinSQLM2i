package com.example.demo.services;

import java.util.List;

public interface GenericService<T> {

	public List<T> getAll();
	
	public T getById(Long id);
	
	public T create(T entity);
	
	public T update(T entity);

	public void delete(T entity);
	
}