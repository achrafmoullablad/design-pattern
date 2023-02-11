package model;

public class Voiture implements IVehicule {
	private String marque;
	private String couleur;

	public Voiture(String marque, String couleur) {
		this.marque = marque;
		this.couleur = couleur;
	}

	@Override
	public String getMarque() {
		return marque;
	}

	@Override
	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String getCouleur() {
		return couleur;
	}

	@Override
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [ marque = " + marque + ", couleur = " + couleur + " ]";
	}
}
