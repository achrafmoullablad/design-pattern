package service;

import metier.Guichet;

public class AvecCarte implements GABEtat {
	Guichet guichet;

	public AvecCarte(Guichet guichet) {
		this.guichet = guichet;
	}

	@Override
	public void insererCarte() {
		System.out.println("Carte déja inserée !!!");
	}

	@Override
	public void ejecterCarte() {
		System.out.println("Ejecter la carte");
		guichet.setEtatGuichet(guichet.getSansCarte());
	}

	@Override
	public void saisirPin(int pin) {
		if (pin == 1234) {
			System.out.println("PIN correcte");
			guichet.setEtatGuichet(guichet.getAvecPin());
			guichet.setPin(true);
		} else {
			System.out.println("Pin Incorrecte, Ejecter la carte !!");
			guichet.setPin(false);
			guichet.setEtatGuichet(guichet.getSansCarte());
		}
	}

	@Override
	public void retrait(int montant) {
		System.out.println("Saisir PIN :");
	}
}
