package metier;

import service.AvecCarte;
import service.AvecPin;
import service.GABEtat;
import service.PasDArgent;
import service.SansCarte;

public class Guichet {
	private GABEtat avecCarte;
	private GABEtat sansCarte;
	private GABEtat avecPin;
	private GABEtat pasDArgent;
	private GABEtat etatGuichet;
	private int soldeGAB = 1000;
	private boolean pin = false;

	public Guichet() {
		avecCarte = new AvecCarte(this); // intialisation
		sansCarte = new SansCarte(this); // intialisation
		avecPin = new AvecPin(this); // intialisation
		pasDArgent = new PasDArgent(this); // intialisation
		etatGuichet = sansCarte; // etat intiale du GAB
		if (soldeGAB <= 0) { // Verification du solde dans le GAB
			etatGuichet = pasDArgent;
		}
	}

	public void setEtatGuichet(GABEtat etatGuichet) {
		this.etatGuichet = etatGuichet;
	}

	public GABEtat getAvecCarte() {
		return avecCarte;
	}

	public GABEtat getAvecPin() {
		return avecPin;
	}

	public GABEtat getPasDArgent() {
		return pasDArgent;
	}

	public GABEtat getEtatGuichet() {
		return etatGuichet;
	}

	public GABEtat getSansCarte() {
		return sansCarte;
	}

	public int getSoldeGAB() {
		return soldeGAB;
	}

	public void setSoldeGAB(int soldeGAB) {
		this.soldeGAB = soldeGAB;
	}

	public void insererCarte() {
		etatGuichet.insererCarte();
	}

	public void ejecterCarte() {
		etatGuichet.ejecterCarte();
	}

	public void saisirPin(int pin) {
		etatGuichet.saisirPin(pin);
	}

	public void retrait(int montant) {
		etatGuichet.retrait(montant);
	}

	public void setPin(boolean pin) {
		this.pin = pin;
	}
}
