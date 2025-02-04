package de.zeroco.oops;


public class Dog extends Animal {

    public Dog(String colour, String name, String sound) {
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
}