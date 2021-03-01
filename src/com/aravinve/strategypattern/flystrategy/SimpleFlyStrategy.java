package com.aravinve.strategypattern.flystrategy;

public class SimpleFlyStrategy implements IFlyStrategy {

	@Override
	public void fly() {
		System.out.println("Duck flys in simple speed");
	}

}
