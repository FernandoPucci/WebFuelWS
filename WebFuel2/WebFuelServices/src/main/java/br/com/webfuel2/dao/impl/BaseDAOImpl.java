package br.com.webfuel2.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.webfuel2.dao.BaseDAO;

@Repository
public class BaseDAOImpl<T, I extends Serializable> implements BaseDAO<T, I> {
	
	 @PersistenceContext
	 private EntityManager manager;

	@Override
	@Transactional
	public T save(T entity) {

		T saved = null;

		//manager.getTransaction().begin();
		saved = manager.merge(entity);
		//manager.getTransaction().commit();

		return saved;
	}

	@Override
	public void remove(T entity) {
		manager.getTransaction().begin();
		manager.remove(entity);
		//manager.getTransaction().commit();

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
