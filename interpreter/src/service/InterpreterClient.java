package service;

import java.util.Scanner;

import model.Context;

public class InterpreterClient {
	Context context;
	IExpression expression;

	public InterpreterClient(Context context) {
		this.context = context;
	}

	public void interpreter(String input) {
		for (int i = 0; i < 2; i++) {
			System.out.println("\nChoisir(1 ou 2) :)");
			Scanner in = new Scanner(System.in);
			int c = Integer.parseInt(in.nextLine());
			switch (c) {
			case 1:
				expression = new ExpressionToJava(input);
				expression.interpreter(context);
				break;
			case 2:
				expression = new ExpressionToC(input);
				expression.interpreter(context);
				break;
			default:
				System.out.println("Erreur de choix");
			}
		}
	}
}
