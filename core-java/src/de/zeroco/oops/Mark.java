package de.zeroco.oops;

public class Mark implements Cloneable {
	
    String name;
    int age;

    public Mark(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        try {
            Mark mark = new Mark("Tejaswini", 21);
            Mark markOne = (Mark) mark.clone();
            System.out.println("Original Mark Object: " + mark);
            System.out.println("Cloned Mark Object: " + markOne);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
