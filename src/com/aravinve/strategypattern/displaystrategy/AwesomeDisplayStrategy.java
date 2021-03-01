package com.aravinve.strategypattern.displaystrategy;

public class AwesomeDisplayStrategy implements IDisplayStrategy {

	@Override
	public void display() {
		System.out.println("Awesome display of duck");
	}

}
