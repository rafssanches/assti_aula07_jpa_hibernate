package br.rafsanches.assti_aula07_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaPorIdComGetReference {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.getReference(Veiculo.class, 1L);
		System.out.println("\n" + v + "\n");
		manager.close();
		JPAUtil.close();
	}

}
