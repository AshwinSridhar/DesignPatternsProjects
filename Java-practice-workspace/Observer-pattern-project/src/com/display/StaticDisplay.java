package com.display;

import com.observer.Observer;
import com.subject.Subject;

public class StaticDisplay implements Observer,Display {

	int temperature;
	int humidity;
	int precipitation;
	
	public StaticDisplay(Subject s) {
		s.addObservers(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The static display content is : Temperature - "+this.temperature+" # Humidity - "+this.humidity+" # Precipitation - "+this.precipitation);
		
	}

	@Override
	public void update(int temperature, int humidity, int precipitation) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.precipitation = precipitation;
		
		display();
		
	}

	

}
