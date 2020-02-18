package com.application;

import com.display.Display;
import com.display.StaticDisplay;
import com.display.WeatherConditionsSummaryDisplay;
import com.observer.Observer;
import com.subject.Subject;
import com.subject.WeatherData;

public class WeatherDataApplication {

	public static void main(String[] args) {
		
		Subject subject = new WeatherData();
		
		Display staticDisplay = new StaticDisplay(subject);
		
		Display weatherConditionsSummaryDisplay = new WeatherConditionsSummaryDisplay(subject);
		
		subject.setMeasurements(10, 20, 30);
		
		System.out.println("######### Changing Temperature #######");
		
		subject.setMeasurements(40, 50, 60);
		
		System.out.println("######### Removing an observer #######");
		
		subject.removeObserver((Observer)staticDisplay);
		
		subject.setMeasurements(70, 80, 90);

		
	}
}
