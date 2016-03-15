package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 28.02.2016.
 */
// cleaned all not necessary this. and super.
public class Circle extends Shape implements Comparable{
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        //“This is Circle, color: GREEN, radius=22”
        return "This is Circle, color: " + getShapeColor() + ", radius=" + radius;  //you don't need super keyword
    }

    @Override
    // This is Rectangle, color: RED, width=11, height=22,  area is: 242
    public void draw() {
        System.out.println(toString() + " area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if (calcArea() > circle.calcArea()) return 1;
        if (calcArea() < circle.calcArea()) return -1;
        return 0;
    }
}
