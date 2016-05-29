package br.com.webfuel2.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface BaseDAO<T, I extends Serializable> {

	@Transactional
	public T save(T entity);

	@Transactional
	public void remove(T entity);

	@Transactional
	public T getById(Class<T> classe, I pk);

	@Transactional
	public List<T> getAll(Class<T> classe);

}
