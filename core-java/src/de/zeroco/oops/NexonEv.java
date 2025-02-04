package de.zeroco.oops;

public class NexonEv extends ElectricCar {
	
	int timeInHours;
	
	public NexonEv(String owner, int batteryCapacity, Tata tata) {
		super(owner, batteryCapacity, tata);
	}
	
	public static void main(String[] args) {
		NexonEv nexonEv = new NexonEv("tata", 67, new Tata("Nexon", 800000, new Car("Red", 2019, 230)));
		System.out.println(nexonEv.chargeBattery(7));
		System.out.println(nexonEv.chargeBattery(8, 98));
		System.out.println(nexonEv.Owner());
	}
}
