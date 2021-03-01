package com.aravinve.strategypattern.quackstrategy;

public class SimpleQuackStrategy implements IQuackStrategy {

	@Override
	public void quack() {
		System.out.println("This is a simple quack");
	}

}
