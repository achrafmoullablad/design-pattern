package service;

public class CalculatriceImplement implements Calculatrice {
	private int premierNombre;
	private int secondNombre;

	@Override
	public Memento CreerMemento() {
		return new Memento(premierNombre, secondNombre);
	}

	@Override
	public void undo(Memento memento) {
		this.premierNombre = memento.getPremierNombre();
		this.secondNombre = memento.getSecondNombre();
	}

	@Override
	public void setPremierNombre(int premierNombre) {
		this.premierNombre = premierNombre;
	}

	@Override
	public void setSecondNombre(int secondNombre) {
		this.secondNombre = secondNombre;
	}

	@Override
	public int getPremierNombre() {
		return premierNombre;
	}

	@Override
	public int getSecondNombre() {
		return secondNombre;
	}

	@Override
	public int getPlusResultat() {
		return premierNombre + secondNombre;
	}

	@Override
	public int getMoinsResultat() {
		return premierNombre - secondNombre;
	}

	@Override
	public int getDivResultat() {
		return premierNombre / secondNombre;
	}

	@Override
		public int getMultiResultat() {
		return premierNombre*secondNombre;
	}
}