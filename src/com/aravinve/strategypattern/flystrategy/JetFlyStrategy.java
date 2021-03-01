package com.aravinve.strategypattern.flystrategy;

public class JetFlyStrategy implements IFlyStrategy {

	@Override
	public void fly() {
		System.out.println("Duck flys in jet speed");
	}

}
