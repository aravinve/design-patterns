package com.aravinve.strategypattern.flystrategy;

public class NoFlyStrategy implements IFlyStrategy {

	@Override
	public void fly() {
		System.out.println("Duck will not fly");
	}

}
