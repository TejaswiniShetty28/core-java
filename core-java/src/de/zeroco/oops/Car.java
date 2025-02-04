package de.zeroco.oops;

public class Car {
	
	String colour;
	int year;
	int maxSpeed;
	
	public Car(String colour, int year, int speed) {
		this.colour = colour;
		this.year = year;
		this.maxSpeed = speed;
	}
	
	public String getColour() {
		return colour;
	}
	
	public int getYear() {
		return year;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
}
