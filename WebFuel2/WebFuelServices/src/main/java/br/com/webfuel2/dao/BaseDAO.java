package br.com.webfuel2.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface BaseDAO<T, I extends Serializable> {

	
	public T save(T entity);

	
	public void remove(T entity);

	
	public T getById(Class<T> classe, I pk);

	
	public List<T> getAll(Class<T> classe);

}
