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
        Triangle triangle = new Triangle("BlacK", 5, 5, 5);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea());

        Shape[] arr = {rectangle, new Rectangle("yellow", 11, 7), new Rectangle("yellow", 8, 7), new Rectangle("pink", 112, 7), new Rectangle("brown", 11, 7), circle, new Circle("blue", 5),
                triangle, new Triangle("grey", 11, 5, 7)};
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        for (Shape shapeElem : arr) {
            double area = shapeElem.calcArea();
            System.out.println(shapeElem.toString() + ", area is: " + area);
            sumArea += area;
            if (shapeElem instanceof Rectangle) sumRectArea += area;
            if (shapeElem instanceof Triangle) sumTriangleArea += area;
            if (shapeElem instanceof Circle) sumCircleArea += area;
        }
//        Rectangles total area: 234.54
//        Circle total area: 547.231
//        Triangle total area: 356.56
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle  total area: " + sumTriangleArea);
        System.out.println("total area of shapes: " + sumArea);
    }
}
