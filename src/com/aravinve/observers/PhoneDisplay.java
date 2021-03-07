package com.aravinve.observers;

import com.aravinve.observable.WeatherStation;

public class PhoneDisplay implements IObserver {
	
	private WeatherStation weatherStation;
	
	public PhoneDisplay(WeatherStation station) {
		this.weatherStation = station;
	}

	@Override
	public void update() {
		System.out.println("Update Notification Recieved, Type: " + PhoneDisplay.class.getName());
		int temperature = weatherStation.getTemperature();
		System.out.println("Temperature: " + temperature + "C");
	}

}
