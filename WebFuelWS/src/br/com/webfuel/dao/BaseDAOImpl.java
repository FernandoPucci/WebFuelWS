package br.com.webfuel.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.webfuel.factory.DbConnection;

public class BaseDAOImpl  <T, I extends Serializable> implements BaseDAO<T, I>{
	 
	 private DbConnection dbConnection;
	  
	 @Override
	 public T save(T entity) {
	   
	  T saved = null;
	   
	  getEntityManager().getTransaction().begin();
	  saved = getEntityManager().merge(entity);
	  getEntityManager().getTransaction().commit();
	   
	  return saved;
	 }
	 
	 @Override
	 public void remove(T entity) {
	  getEntityManager().getTransaction().begin();
	  getEntityManager().remove(entity);
	  getEntityManager().getTransaction().commit();
	   
	 }
	 
	 @Override
	 public T getById(Class<T> classe, I pk) {
	   
	  try {
	   return getEntityManager().find(classe, pk);
	  } catch (NoResultException e) {
	   return null;
	  }
	   
	 }
	 
	 @SuppressWarnings("unchecked")
	 @Override
	 public List<T> getAll(Class<T> classe) {
	   
	  return getEntityManager().createQuery("select o from " + classe.getSimpleName() + " o").getResultList();
	 }
	 
	 @Override
	 public EntityManager getEntityManager() {
	   
	  if (dbConnection == null) {
	   dbConnection = new DbConnection();
	  }
	  return dbConnection.getEntityManager();
	 }
	 
}
