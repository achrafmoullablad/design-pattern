package tp2;

import java.util.ArrayList;
import java.util.List;

public class ObervableImp implements Observable{
	List<Observer> observers = new ArrayList<Observer>();
	private int state = 10;
	
	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}
	
	public int getState() {
		return state;
	}

	@Override
	public void subscribe(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}
}
