package tp2;

public class ObserverImp implements Observer{

	@Override
	public void update(Observable o) {
		int state = ((ObervableImp)o).getState();
		double res = state*19;
		System.out.println("*****ObSERVER IMPLEMENTATION 1*****");
		System.out.println("Nouvelle mise à jour : state="+state);
		System.out.println("Resutat de calcule :"+res);
		System.out.println("********************\n");
	}
}
