package service;

import java.util.HashMap;
import java.util.Map;

import model.IVehicule;
import model.Moto;
import model.Voiture;

public class Usine {
	Map<String, IVehicule> entrepot;

	public Usine() {
		entrepot = new HashMap<String, IVehicule>();
	}

	public IVehicule getVehicule(String type, String marque, String couleur) throws Exception {
		IVehicule vehicule = null;
		if (entrepot.containsKey(type)) {
			vehicule = entrepot.get(type);
			vehicule.setMarque(marque);
			vehicule.setCouleur(couleur);
		} else {
			switch (type) {
			case "voiture":
				System.out.println("il y pas une Voiture dans la mémoire. Creation maintenant ...");
				vehicule = new Voiture(marque, couleur);
				entrepot.put("voiture", vehicule);
				break;
			case "moto":
				System.out.println("il y pas une Moto dans la mémoire. Creation maintenant ...");
				vehicule = new Moto(marque, couleur);
				entrepot.put("moto", vehicule);
				break;
			default:
				throw new Exception("Flyweight Factory crée que des Voitures ou des Motos");
			}
		}
		return vehicule;
	}

	public int nombreVehicule() {
		return entrepot.size();
	}
}
