package service;

import metier.Guichet;

public class PasDArgent implements GABEtat {
	Guichet guichet;

	public PasDArgent(Guichet guichet) {
		this.guichet = guichet;
	}

	@Override
	public void insererCarte() {
		System.out.println("Pas d'argent sur le guichet !!");
	}

	@Override
	public void ejecterCarte() {
		System.out.println("Pas d'argent sur le guichet !!");
	}

	@Override
	public void saisirPin(int pin) {
		System.out.println("Pas d'argent sur le guichet !!");
	}

	@Override
	public void retrait(int montant) {
		System.out.println("Pas d'argent sur le guichet !!");
	}
}