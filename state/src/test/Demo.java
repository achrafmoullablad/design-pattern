package test;

import metier.Guichet;

public class Demo {
	public static void main(String[] args) {
		Guichet guichet = new Guichet();
		guichet.insererCarte();
		guichet.ejecterCarte();
		guichet.saisirPin(1234);
		guichet.insererCarte();
		guichet.saisirPin(1234);
		guichet.retrait(500);
		guichet.retrait(500);
		guichet.insererCarte();
		guichet.saisirPin(1234);
		guichet.retrait(500);
		guichet.insererCarte();
		guichet.saisirPin(1234);
		guichet.retrait(500);
	}
}
