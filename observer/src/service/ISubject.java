package service;

public interface ISubject {
	void ajouter(IObserver o);

	void supprimer(IObserver o);

	void notifierObservers(int valeur);
}
