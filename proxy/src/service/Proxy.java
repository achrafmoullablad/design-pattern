package service;

public class Proxy implements Sujet {
	CSujet cs;

	public Proxy() {
		cs = new CSujet();
	}

	@Override
	public void TransfertMessage(String message) {
		System.out.println("Proxy : contrôle de Message");
		System.out.println("*******************************");
		if (message.equals("Bonjour")) {
			System.out.println("Proxy : Message " + message + " Transfèré ");
			cs.TransfertMessage(message);
		} else
			System.out.println("Proxy : Message " + message + " bloqué !!!!! \n\n");
	}
}
