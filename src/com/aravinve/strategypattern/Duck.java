package com.aravinve.strategypattern;

import com.aravinve.strategypattern.flystrategy.IFlyStrategy;
import com.aravinve.strategypattern.quackstrategy.IQuackStrategy;

public class Duck {
	
	private IFlyStrategy flyStrategy;
	private IQuackStrategy quackStrategy;
	
	public Duck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy)
	{
		this.flyStrategy = flyStrategy;
		this.quackStrategy = quackStrategy;
	}
	
	/**
	 * Duck Execution
	 */
	public void execute() {
		this.flyStrategy.fly();
		this.quackStrategy.quack();
	}
}
