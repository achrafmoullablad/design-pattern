package service;

public interface Calculatrice {
	public Memento CreerMemento();

	public void undo(Memento memento);

	public int getPlusResultat();

	public int getMoinsResultat();

	public int getDivResultat();

	public int getMultiResultat();

	public void setPremierNombre(int premierNombre);

	public void setSecondNombre(int secondNombre);

	public int getPremierNombre();

	public int getSecondNombre();
}
