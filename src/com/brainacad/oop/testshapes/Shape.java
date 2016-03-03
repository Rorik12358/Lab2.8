package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 28.02.2016.
 */
public abstract class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor.toUpperCase();
    }

    @Override
    public String toString() {
        return "Shape, color is: "+shapeColor;
    }
    public abstract double calcArea ();
    public String getShapeColor() {
        return shapeColor;
    }
}
