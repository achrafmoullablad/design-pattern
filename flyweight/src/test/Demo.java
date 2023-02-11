package test;

import model.IVehicule;
import service.Usine;

public class Demo {
	public static void main(String[] args) throws Exception {
		System.out.println("\n***Flyweight Pattern Demo***\n");
		Usine usine = new Usine();
		IVehicule vehicule;
		System.out.println("\nxxxxxx Voiture xxxxxx\n");
		// voiture Mercedes
		vehicule = usine.getVehicule("voiture", "Mercedes", "Rouge");
		System.out.println(vehicule);
		// voiture Ford
		vehicule = usine.getVehicule("voiture", "Ford", "Noire");
		System.out.println(vehicule);
		// voiture Audi
		vehicule = usine.getVehicule("voiture", "Audi", "Bleue");
		System.out.println(vehicule);
		System.out.println("\nxxxxxx Moto xxxxxx\n");
		// Moto Kawasaki
		vehicule = usine.getVehicule("moto", "Kawasaki", "verte");
		System.out.println(vehicule);
		// Moto Honda
		vehicule = usine.getVehicule("moto", "Honda", "Rouge");
		System.out.println(vehicule);
		// voiture Yamaha
		vehicule = usine.getVehicule("moto", "Yamaha", "Orange");
		System.out.println(vehicule);
		System.out.println("\nNombre des vehicules créés : " + usine.nombreVehicule());
	}
}
