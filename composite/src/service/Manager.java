package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employe {
	private String nom;
	private double salaire;

	public Manager(String nom, double salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}

	List<Employe> employes = new ArrayList<Employe>();

	public void add(Employe employe) {
		employes.add(employe);
	}

	public Employe getChild(int i) {
		return employes.get(i);
	}

	public String getNom() {
		return nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("nom =" + getNom());
		System.out.println("salaire =" + getSalaire());
		System.out.println("-------------");
		Iterator<Employe> employeIterator = employes.iterator();
		while (employeIterator.hasNext()) {
			Employe employe = employeIterator.next();
			employe.print();
		}
	}

	public void remove(Employe employe) {
		employes.remove(employe);
	}
}