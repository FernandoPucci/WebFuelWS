package br.com.webfuel2.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.webfuel2.dao.BaseDAO;

/**
 * 
 * 
 * Implementção de DAO genérico, deixando parte transacional por conta do Spring
 * 
 * @author fernando-pucci
 *
 * @param <T>
 * @param <I>
 */
@Repository
public class BaseDAOImpl<T, I extends Serializable> implements BaseDAO<T, I> {

	@PersistenceContext
	private EntityManager manager;

	@Override
	@Transactional
	public T save(T entity) {

		T saved = null;

		saved = manager.merge(entity);

		return saved;
	}

	@Override
	@Transactional
	public void remove(T entity) {

		manager.remove(entity);

	}

	@Override
	public T getById(Class<T> classe, I pk) {

		try {
			return manager.find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll(Class<T> classe) {

		return manager.createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
	}

}
