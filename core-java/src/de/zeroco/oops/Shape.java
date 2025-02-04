package de.zeroco.oops;

interface Shape {
    
    double area();

    default String displayShape() {
        return "This is a shape.";
    }
}
