package model;

import service.Mediator;

public abstract class Amis {
	protected Mediator mediator;
	protected String nom;

	public Amis(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getNom() {
		return nom;
	}
}