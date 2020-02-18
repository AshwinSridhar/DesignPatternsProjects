package com.display;

import com.observer.Observer;
import com.subject.Subject;

public class WeatherConditionsSummaryDisplay implements Display, Observer {

	int temperature;
	int humidity;
	int precipitation;
	
	public WeatherConditionsSummaryDisplay(Subject s) {
		s.addObservers(this);
	}
	
	@Override
	public void update(int temperature, int humidity, int precipitation) {
		// TODO Auto-generated method stub
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.precipitation = precipitation;
		
		display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Weather Condition Summary - ");

	}

}
