package de.zeroco.oops;

public class Altroz extends Car {
	
	public Altroz(String colour, int year, int maxSpeed) {
		super(colour, year, maxSpeed);
	}
	
	public static void main(String[] args) {
		Altroz altroz = new Altroz("Black", 2012, 130);
		System.out.println(altroz.getColour());
		System.out.println(altroz.getMaxSpeed());
		System.out.println(altroz.getYear());	
	}

}
