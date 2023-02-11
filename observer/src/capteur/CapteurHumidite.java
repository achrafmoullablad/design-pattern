package capteur;

import java.util.ArrayList;
import java.util.List;

import service.IObserver;
import service.ISubject;

public class CapteurHumidite implements ISubject {
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int tauxHum;

	public int getTauxHum() {
		return tauxHum;
	}

	public void setHumidite(int tauxHum) {
		this.tauxHum = tauxHum;
		notifierObservers(tauxHum);
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