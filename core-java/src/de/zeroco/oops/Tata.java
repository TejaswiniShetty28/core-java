package de.zeroco.oops;

public class Tata {
	
	String model;
	int price;
	Car car;
	
	public Tata(String model, int price, Car car) {
		this.model = model;
		this.price = price;
		this.car = car;		
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		Car car = new Car("Red", 2019, 190);
		Tata tata = new Tata("Nexon", 800000, car);
		System.out.println(tata.getModel());
		System.out.println(tata.getPrice());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getColour());
		System.out.println(car.getYear());
	}
	
}
