package com.aravinve.observers;

import com.aravinve.observable.WeatherStation;

public class WindowDisplay implements IObserver {
	
	private WeatherStation weatherStation;
	
	public WindowDisplay(WeatherStation station) {
		this.weatherStation = station;
	}

	@Override
	public void update() {
		System.out.println("Update Notification Recieved, Type: " + WindowDisplay.class.getName());
		int temperature = weatherStation.getTemperature();
		System.out.println("Temperature: " + temperature + "C");
	}

}
