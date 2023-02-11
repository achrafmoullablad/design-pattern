package model;

import service.IObserver;

public class Conducteur implements IObserver {
	public void update(String nom, int valeur) {
		System.out.println("Conducteur notifié par : " + nom + " valeur : " + valeur);
	}
}