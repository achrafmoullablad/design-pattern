package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Context {
	private String expression;

	public void toJava(String expression) {
		System.out.print("code pour traduire vers langage Java");
	}

	public void toC(String expression) {
		System.out.print("code pour traduire vers langage C");
	}
}
