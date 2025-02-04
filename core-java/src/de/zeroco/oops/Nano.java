package de.zeroco.oops;

public class Nano extends Car {
	
	int mileage;
	
	public Nano(String colour, int year, int maxSpeed, int mileage) {
		super(colour, year, maxSpeed);
		this.mileage = mileage;
	}
	
	public static void main(String[] args) {
		Nano nano = new Nano("Red", 2013, 110, 23);
		System.out.println(nano.getColour());
		System.out.println(nano.getMaxSpeed());
		System.out.println(nano.getYear());	
	}

}
