package model;

public class Moto implements IVehicule {
	private String marque;
	private String couleur;

	public Moto(String marque, String couleur) {
		super();
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
		return "Moto [ marque = " + marque + ", couleur = " + couleur + " ]";
	}
}
