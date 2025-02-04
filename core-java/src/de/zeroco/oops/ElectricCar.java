package de.zeroco.oops;

public class ElectricCar {
	
	String owner;
	int batterCapacity;
	Tata tata;
	
	public ElectricCar(String owner, int batteryCapacity, Tata tata) {
		this.owner = owner;
		this.batterCapacity = batteryCapacity;
		this.tata = tata;
	}
	
	public ElectricCar(String owner,Tata tata) {
		this.owner = owner;
		this.tata = tata;
	}
	
	public int chargeBattery(int chargeTime) {
		return chargeTime;
	}
	
	public final  int chargeBattery(int chargeTime, int batteryCapacity) {
		return chargeTime + batteryCapacity;
	}
	
	public String Owner() {
		return owner;
	}
	
	public String fuelType(String fuel) {
		return fuel;
	}
	
	public static void main(String[] args) {
		ElectricCar eCar = new ElectricCar("Ratan Tata", new Tata("Nexon", 800000, new Car("Red", 2019, 230)));
		ElectricCar evCar = new ElectricCar("Ratan Tata",46, new Tata("Nexon", 800000, new Car("Red", 2019, 230)));	
		System.out.println(eCar.chargeBattery(8));
		System.out.println(evCar.chargeBattery(8, 68));
		System.out.println(evCar.Owner());
		System.out.println(eCar.Owner());
	}

}
