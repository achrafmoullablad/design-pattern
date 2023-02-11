package service;

import metier.Guichet;

public class AvecPin implements GABEtat {
	Guichet guichet;

	public AvecPin(Guichet guichet) {
		this.guichet = guichet;
	}

	@Override
	public void insererCarte() {
		System.out.println("Catre déja inserer !!");
	}

	@Override
	public void ejecterCarte() {
		System.out.println("Carte Ejectée");
		guichet.setEtatGuichet(guichet.getSansCarte());
	}

	@Override
	public void saisirPin(int pin) {
		System.out.println("PIN déja saisie !!");
	}

	@Override
	public void retrait(int montant) {
		if (montant <= guichet.getSoldeGAB()) {
			System.out.println("Retrait de " + montant + " DH");
			guichet.setSoldeGAB(guichet.getSoldeGAB() - montant);
			System.out.println("Carte Ejectée");
			guichet.setEtatGuichet(guichet.getSansCarte());
			if (guichet.getSoldeGAB() <= 0) {
				guichet.setEtatGuichet(guichet.getPasDArgent());
			}
		} else {
			System.out.println("Pas d'argent en Guichet");
			System.out.println("Carte Ejectée");
			guichet.setEtatGuichet(guichet.getSansCarte());
		}
	}
}
