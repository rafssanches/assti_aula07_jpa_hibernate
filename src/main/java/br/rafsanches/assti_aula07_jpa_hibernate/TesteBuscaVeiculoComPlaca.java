package br.rafsanches.assti_aula07_jpa_hibernate;

import javax.persistence.EntityManager;

public class TesteBuscaVeiculoComPlaca {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println("\n" + v + "\n");
		manager.close();
		JPAUtil.close();
	}

}
