package com.subject;

import com.observer.Observer;

public interface Subject {
	public void addObservers(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	
	public void setMeasurements(int temperature,int humidity,int precipitation) ;
}
