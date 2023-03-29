package org.example;

import java.awt.*;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "A circle with radius = "
                + this.radius
                + ", which is a subclass of "
                + super.toString();
    }
}
