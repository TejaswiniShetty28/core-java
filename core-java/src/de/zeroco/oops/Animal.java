package de.zeroco.oops;

abstract public class Animal {
	
	public String colour;
	public String name;
	public String sound;
	
	public Animal(String colour, String name, String sound) {
		this.colour = colour;
		this.name = name;
		this.sound = sound;
	}

	abstract public String name();
	abstract public String colour();
	abstract public String sound();
	
	public String checkIntance(Object obj) {
		if (obj instanceof Dog) {
			return "DownCast to Dog";
		} else {
			return "DownCast to Cat";
		}
	}
}
