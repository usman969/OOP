package com.company;

public class L4A1Runner {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circumference of Circle 1 is " ); c1.CalculateArea();
        int r = c1.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(10);
        System.out.println("Circumference of Circle 2 is " ); c2.CalculateArea();
    }
}
