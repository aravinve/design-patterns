package com.aravinve.strategypattern.displaystrategy;

public class SimpleDisplayStrategy implements IDisplayStrategy {

	@Override
	public void display() {
		System.out.println("Simple Display of duck");
	}

}
