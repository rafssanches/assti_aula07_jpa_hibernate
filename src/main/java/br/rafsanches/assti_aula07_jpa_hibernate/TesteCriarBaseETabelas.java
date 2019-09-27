package br.rafsanches.assti_aula07_jpa_hibernate;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main (String[] args) {
		Persistence.createEntityManagerFactory("asstiPU");
	}

}
