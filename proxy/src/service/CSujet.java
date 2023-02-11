package service;

public class CSujet implements Sujet {
	@Override
	public void TransfertMessage(String message) {
		System.out.println("Message bien reçu : " + message + "\n\n");
	}
}