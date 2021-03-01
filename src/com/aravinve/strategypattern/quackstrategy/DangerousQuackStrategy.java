package com.aravinve.strategypattern.quackstrategy;

public class DangerousQuackStrategy implements IQuackStrategy {

	@Override
	public void quack() {
		System.out.println("This is a dangerous quack");
	}

}
