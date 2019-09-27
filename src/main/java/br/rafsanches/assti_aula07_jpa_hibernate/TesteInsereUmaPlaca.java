package br.rafsanches.assti_aula07_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmaPlaca {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = new Placa();
		p.setCidade("São Caetano");
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
