package capteur;

import java.util.ArrayList;
import java.util.List;

import service.IObserver;
import service.ISubject;

public class CapteurTemperature implements ISubject {
	List<IObserver> observerList = new ArrayList<IObserver>();
	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifierObservers(temperature);
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