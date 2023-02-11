package service;

public interface Employe {
	public void add(Employe employe);
	public void remove(Employe employee);
	public Employe getChild(int i);
	public String getNom();
	public double getSalaire();
	public void print();
}
