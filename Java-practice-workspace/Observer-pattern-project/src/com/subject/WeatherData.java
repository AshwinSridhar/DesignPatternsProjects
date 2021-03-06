package com.subject;

import java.util.ArrayList;
import java.util.List;

import com.observer.Observer;

public class WeatherData implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	private int temperature;
	private int humidity;
	private int precipitation;
	
	public void setMeasurements(int temperature,int humidity,int precipitation) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.precipitation = precipitation;
		
		notifyObservers();
		
	}
	
	@Override
	public void addObservers(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for(Observer observer: this.observers) {
			observer.update(temperature,humidity,precipitation);
		}
		
	}

}
