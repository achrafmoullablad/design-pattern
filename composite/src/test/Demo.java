package test;

import service.Developer;
import service.Employe;
import service.Manager;

public class Demo {
	public static void main(String[] args) {
		Employe emp1=new Developer("Youness", 10000);
		Employe emp2=new Developer("Mohammed", 15000);
		Employe manager1=new Manager("Karim",25000);
		manager1.add(emp1);
		manager1.add(emp2);
		Employe emp3=new Developer("Ahmed", 20000);
		Manager generalManager=new Manager("Tabii", 50000);
		generalManager.add(emp3);
		generalManager.add(manager1);
		generalManager.print();
	}
}
