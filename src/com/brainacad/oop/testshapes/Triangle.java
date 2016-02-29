package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 29.02.2016.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    //“This is Triangle, color: BLACK, a=5, b=5, c=5”
    public String toString() {
        return "This is Triangle, color: " + super.getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.pow(s * (s - a) * (s - b) * (s - c), 1. / 2);
    }
}
