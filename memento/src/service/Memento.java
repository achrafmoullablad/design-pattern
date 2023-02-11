package service;

public class Memento {
	private int premierNombre;
	private int secondNombre;

	public Memento(int premierNombre, int secondNombre) {
		this.premierNombre = premierNombre;
		this.secondNombre = secondNombre;
	}

	public int getPremierNombre() {
		return premierNombre;
	}

	public int getSecondNombre() {
		return secondNombre;
	}
}
