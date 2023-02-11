package service;

import metier.Guichet;

public class SansCarte implements GABEtat {
	Guichet guichet;

	public SansCarte(Guichet guichet) {
		this.guichet = guichet;
	}

	@Override
	public void insererCarte() {
		System.out.println("Siasir PIN: ");
		guichet.setEtatGuichet(guichet.getAvecCarte());
	}

	@Override
	public void ejecterCarte() {
		System.out.println("Pas de carte a Ejecter !!");
	}

	@Override
	public void saisirPin(int pin) {
		System.out.println("Inserer la Carte !!");
	}

	@Override
	public void retrait(int montant) {
		System.out.println("Inserer la Carte !!");
	}
}