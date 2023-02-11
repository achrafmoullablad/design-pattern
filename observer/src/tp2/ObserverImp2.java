package tp2;

public class ObserverImp2 implements Observer{
	private int counter;
	@Override
	public void update(Observable o) {
		int state = ((ObervableImp)o).getState();
		if(state==0) counter++;
		System.out.println("*****ObSERVER IMPLEMENTATION 1*****\n");
		System.out.println("Nouvelle mise à jour : state="+state);
		System.out.println("Resutat de calcule :"+((state%2)==0?"Pair":"impaire"));
		System.out.println("Le compteur est :"+counter);
		System.out.println("********************\n");
	}
}
