package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 28.02.2016.
 */
public class Circle extends Shape{
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
        return "This is Circle, color: "+super.getShapeColor()+", radius="+radius;
    }
}
