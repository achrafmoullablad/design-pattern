package service;

import model.Context;

public class ExpressionToJava implements IExpression {
	private String expression;

	public ExpressionToJava(String expression) {
		this.expression = expression;
	}

	@Override
	public void interpreter(Context context) {
		context.toJava(expression);
	}
}