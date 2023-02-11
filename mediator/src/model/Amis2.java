package model;

import service.Mediator;

public class Amis2 extends Amis {
	public Amis2(Mediator mediator, String nom) {
		super(mediator);
		this.nom = nom;
	}

	public void envoyer(String msg) {
		mediator.envoyer(this, msg);
	}

	public void notifier(String msg) {
		System.out.println(nom + " à reçu le message : " + msg);
	}
}
