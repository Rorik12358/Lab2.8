package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 28.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red");
        System.out.println("This is "+shape);
        System.out.println("Shape area is: "+shape.calcArea());
        Circle circle = new Circle("Green",10);
        System.out.println(circle);
        System.out.println("Shape area is: "+circle.calcArea());
        Rectangle rectangle = new Rectangle("red", 11, 22);
        System.out.println(rectangle);
        System.out.println("Shape area is: "+rectangle.calcArea());
    }
}
