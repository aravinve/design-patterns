package com.aravinve.strategypattern;

import com.aravinve.strategypattern.displaystrategy.AwesomeDisplayStrategy;
import com.aravinve.strategypattern.displaystrategy.SimpleDisplayStrategy;
import com.aravinve.strategypattern.flystrategy.JetFlyStrategy;
import com.aravinve.strategypattern.flystrategy.NoFlyStrategy;
import com.aravinve.strategypattern.flystrategy.SimpleFlyStrategy;
import com.aravinve.strategypattern.quackstrategy.DangerousQuackStrategy;
import com.aravinve.strategypattern.quackstrategy.SimpleQuackStrategy;

public class Main {

	public static void main(String[] args) {

		System.out.println("Strategy Pattern");
		System.out.println("************************************************************");
		
		System.out.println("WildDuck");
		Duck wildduck = new Duck(new SimpleFlyStrategy(), new DangerousQuackStrategy(), new AwesomeDisplayStrategy());
		wildduck.execute();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("RubberDuck");
		Duck rubberduck = new Duck(new NoFlyStrategy(), new SimpleQuackStrategy(), new SimpleDisplayStrategy());
		rubberduck.execute();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("CityDuck");
		Duck cityduck = new Duck(new SimpleFlyStrategy(), new SimpleQuackStrategy(), new SimpleDisplayStrategy());
		cityduck.execute();
		System.out.println("------------------------------------------------------------");
		
		System.out.println("MountainDuck");
		Duck mountainduck = new Duck(new JetFlyStrategy(), new DangerousQuackStrategy(), new AwesomeDisplayStrategy());
		mountainduck.execute();
		System.out.println("------------------------------------------------------------");
		
	}
}
