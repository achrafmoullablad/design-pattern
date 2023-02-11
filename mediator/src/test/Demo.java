package test;

import model.Administrateur;
import model.Amis1;
import model.Amis2;
import service.GroupeWhatsapp;

public class Demo {
	public static void main(String[] args) {
		System.out.println("***Mediator Pattern Demo***\n");
		GroupeWhatsapp m = new GroupeWhatsapp();
		Amis1 youness = new Amis1(m, "Youness");
		Amis2 taha = new Amis2(m, "Taha");
		Administrateur admin = new Administrateur(m, "Admin");
		m.setAmis1(youness);
		m.setAmis2(taha);
		m.setAdmin(admin);
		youness.envoyer("[Youness]: Bonjour Taha");
		taha.envoyer("[Taha]: Bonjour Youness.");
		admin.envoyer("\n[Admin]: Bonjour vous deux, allez travailler");
	}
}
