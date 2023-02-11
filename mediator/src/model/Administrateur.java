package model;

import service.Mediator;

public class Administrateur extends Amis {
	public Administrateur(Mediator mediator, String nom) {
		super(mediator);
		this.nom = nom;
	}

	public void envoyer(String msg) {
		mediator.envoyer(this, msg);
	}

	public void notifier(String msg) {
		System.out.println("Administrateur a vu le message : " + msg);
	}
}