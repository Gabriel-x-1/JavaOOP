package Cor_5;

import java.lang.Math;

public class Circle {

    int x;
    int y;
    double radius;

    public Circle(int center_x, int center_y, double circle_radius) {
        x = center_x;
        y = center_y;
        radius = circle_radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 20);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

    }
}
