package service;

import java.util.Stack;

public class CareTaker {
	private Stack<Memento> mementoStack;

	public CareTaker() {
		mementoStack = new Stack<Memento>();
	}

	public void SaveMementoStack(Memento m) {
		mementoStack.push(m);
	}

	public Memento RetrieveMementoStack() {
		return mementoStack.pop();
	}
}