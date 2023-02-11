package test;

import java.util.Scanner;

import model.Context;
import service.InterpreterClient;

public class Demo {
	public static void main(String[] args) {
		System.out.println("*** Interpreter Pattern Demo ***\n");
		System.out.println("Entrer une Expression:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Context context = new Context(input);
		InterpreterClient client = new InterpreterClient(context);
		client.interpreter(input);
	}
}