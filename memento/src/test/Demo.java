package test;

import service.Calculatrice;
import service.CalculatriceImplement;
import service.CareTaker;

public class Demo {
	public static void main(String[] args) {
		System.out.println("*** Memento Pattern Demo***\n");
		Calculatrice calculatrice = new CalculatriceImplement();
		calculatrice.setPremierNombre(4);
		calculatrice.setSecondNombre(2);
		CareTaker c = new CareTaker();
		c.SaveMementoStack(calculatrice.CreerMemento());
		calculatrice.setPremierNombre(40);
		calculatrice.setSecondNombre(20);
		System.out.println(calculatrice.getPremierNombre());
		System.out.println(calculatrice.getSecondNombre());
		calculatrice.undo(c.RetrieveMementoStack());
		System.out.println(calculatrice.getPremierNombre());
		System.out.println(calculatrice.getSecondNombre());
	}
}
