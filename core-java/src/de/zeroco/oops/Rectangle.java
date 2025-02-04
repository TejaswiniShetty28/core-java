package de.zeroco.oops;

class Rectangle implements Shape {
    
    private double length;
    private double width;
    private String shape; 

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.shape = "Rectangle";
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String displayShape() {
        return shape;  
    }

    public int calculatePerimeter() {
        return 2 * (int)(length + width); 
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);  
        System.out.println("Rectangle Area: " + rectangle.area()); 
        System.out.println(rectangle.displayShape());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); 
    }
}







