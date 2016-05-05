package br.com.webfuel.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	// nome da unidade de persistencia definia no persistence.xml
	private static final String UNIT_NAME = "WebFuelWS_PU";

	private EntityManagerFactory emf = null;

	private EntityManager em = null;

	public EntityManager getEntityManager() {

		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(UNIT_NAME);
		}

		if (em == null) {
			em = emf.createEntityManager();
		}

		return em;
	}
}
