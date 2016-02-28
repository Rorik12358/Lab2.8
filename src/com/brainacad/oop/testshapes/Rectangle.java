package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 29.02.2016.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    //“This is Rectangle, color: RED, width=11, height=22”
    public String toString() {
        return "This is Rectangle, color: "+getShapeColor()+", width="+width+", height="+height;
    }
}