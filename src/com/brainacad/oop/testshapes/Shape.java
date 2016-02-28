package com.brainacad.oop.testshapes;

/**
 * Created by R2-D2 on 28.02.2016.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor.toUpperCase();
    }

    @Override
    public String toString() {
        return "Shape, color is: "+shapeColor;
    }
    public double calcArea (){
        return 0;
    }
    public String getShapeColor() {
        return shapeColor;
    }
}
