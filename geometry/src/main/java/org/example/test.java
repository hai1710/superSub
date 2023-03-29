package org.example;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "blue", true);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5, "red", false);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5, "yellow", true);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
