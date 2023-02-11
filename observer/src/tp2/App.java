package tp2;

public class App {

	public static void main(String[] args) {
		ObervableImp observable = new ObervableImp();
		Observer o1 = new ObserverImp();
		Observer o2 = new ObserverImp();
		Observer o3 = new ObserverImp2();
		
		observable.subscribe(o1);
		observable.subscribe(o2);
		observable.subscribe(o3);
		
		observable.setState(15);
		observable.setState(18);
		observable.unsubscribe(o1);
		observable.setState(20);
	}

}
