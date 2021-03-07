package com.aravinve.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.aravinve.observers.IObserver;

public class WeatherStation implements IObservable {

	private List<IObserver> observersList;
	private int temperature;
	
	public WeatherStation() {
		this.observersList = new ArrayList<>();
		this.temperature = 30;
	}
	
	@Override
	public void add(IObserver observer) {
		this.observersList.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		this.observersList.remove(observer);
	}

	@Override
	public void notifyUpdate() {
		System.out.println("Notify Updates For All Observers");
		Random r = new Random();
		this.temperature = r.nextInt(50);
		for(IObserver observer: observersList) {
			observer.update();
		}
	}
	
	public int getTemperature() {
		return this.temperature;
	}

}
