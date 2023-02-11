package test;

import service.Proxy;

public class Demo {
	public static void main(String[] args) {
		System.out.println("***Proxy Pattern Demo***\n");
		Proxy px = new Proxy();
		px.TransfertMessage("Bonsoir");
		px.TransfertMessage("Bonjour");
		px.TransfertMessage("hola");
	}
}
