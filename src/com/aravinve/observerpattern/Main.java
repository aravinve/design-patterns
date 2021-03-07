package com.aravinve.observerpattern;

import com.aravinve.observable.WeatherStation;
import com.aravinve.observers.PhoneDisplay;
import com.aravinve.observers.WindowDisplay;

public class Main {

	public static void main(String[] args) {
		// Configuring Observers and Observable
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay pd1 = new PhoneDisplay(weatherStation);
		PhoneDisplay pd2 = new PhoneDisplay(weatherStation);
		WindowDisplay wd = new WindowDisplay(weatherStation);
		
		// Registering observers to the observable
		weatherStation.add(pd1);
		weatherStation.add(pd2);
		weatherStation.add(wd);
		
		// Notify Updates -- Push From Observable to all Observers
		weatherStation.notifyUpdate();
		
		System.out.println();
		
		// Unregister an observer from the observable
		weatherStation.remove(pd2);
		
		// Notify Updates -- Push From Observable to all Observers
		weatherStation.notifyUpdate();
	}
}
