package com.aravinve.strategypattern;

import com.aravinve.strategypattern.displaystrategy.IDisplayStrategy;
import com.aravinve.strategypattern.flystrategy.IFlyStrategy;
import com.aravinve.strategypattern.quackstrategy.IQuackStrategy;

public class Duck {
	
	private IFlyStrategy flyStrategy;
	private IQuackStrategy quackStrategy;
	private IDisplayStrategy displayStrategy;
	
	public Duck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy, IDisplayStrategy displayStrategy)
	{
		this.flyStrategy = flyStrategy;
		this.quackStrategy = quackStrategy;
		this.displayStrategy = displayStrategy;
	}
	
	/**
	 * Duck Execution
	 */
	public void execute() {
		this.flyStrategy.fly();
		this.quackStrategy.quack();
		this.displayStrategy.display();
	}
}
