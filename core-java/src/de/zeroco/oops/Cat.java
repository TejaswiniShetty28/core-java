package de.zeroco.oops;

public class Cat extends Animal {
	
	public Cat(String colour, String name, String sound) {
        super(colour, name, sound);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String colour() {
        return colour;
    }

    @Override 
    public String sound() {
        return sound;
    }
    
    public static void main(String[] args) {
    	Animal animal = new Dog("Dog", "Black", "Bark");
    	System.out.println(animal.colour + " " + animal.sound + " " + animal.name + " " + animal.checkIntance(animal));
    	
    	animal = new Cat("Cat", "White", "Meow");
    	System.out.println(animal.colour + " " + animal.sound + " " + animal.name +" " + animal.checkIntance(animal));
    	
    	Cat cat = (Cat) animal;
    	System.out.println(cat.colour + " " + cat.sound + " " + cat.name);
   
    }
}
