package capteur;

import java.util.ArrayList;
import java.util.List;

import service.IObserver;
import service.ISubject;

public class CapteurLumiere implements ISubject {
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int tauxLumiere;

	public int getTauxLumiere() {
		return tauxLumiere;
	}

	public void setLumiere(int tauxLumiere) {
		this.tauxLumiere = tauxLumiere;
		notifierObservers(tauxLumiere);
	}

	@Override
	public void ajouter(IObserver o) {
		observerList.add(o);
	}

	@Override
	public void supprimer(IObserver o) {
		observerList.remove(o);
	}

	@Override
	public void notifierObservers(int valeur) {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(this.getClass().getSimpleName(), valeur);
		}
	}
}