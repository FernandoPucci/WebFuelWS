package br.com.webfuel2.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interface de DAO Generico com operações de CRUD básicas
 * 
 * @author fernando-pucci
 *
 * @param <T>
 * @param <I>
 */
public interface BaseDAO<T, I extends Serializable> {

	public T save(T entity);

	public void remove(T entity);

	public T getById(Class<T> classe, I pk);

	public List<T> getAll(Class<T> classe);

}
