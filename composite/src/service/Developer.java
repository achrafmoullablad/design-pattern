package service;

public class Developer implements Employe {
	private String nom;
	private double salaire;

	public Developer(String nom, double salaire) {
		this.nom = nom;
		this.salaire = salaire;
	}

	public void add(Employe employee) {
		//n'est pas Applicable
	}

	public Employe getChild(int i) {
		//n'est pas Applicable
		return null;
	}

	public String getNom() {
		return nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Nom ="+getNom());
		System.out.println("Salaire="+getSalaire());
		System.out.println("-------------");
	}

	public void remove(Employe employee) {
		//n'est pas Applicable
	}
}