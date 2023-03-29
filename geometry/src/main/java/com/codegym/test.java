package com.codegym;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "green");
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Cylinder cylinder = new Cylinder(5,"red",2);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
    }
}
