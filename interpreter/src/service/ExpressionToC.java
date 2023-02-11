package service;

import model.Context;

public class ExpressionToC implements IExpression {
	private String expression;

	public ExpressionToC(String expression) {
		this.expression = expression;
	}

	@Override
	public void interpreter(Context context) {
		context.toC(expression);
	}
}