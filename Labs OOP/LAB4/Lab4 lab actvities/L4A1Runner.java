package com.company;

public class L4A1Runner {
    public static void main(String[] args) {
        C c1 = new C();
        c1.setRadius(5);
        System.out.println("Circumference of C 1 is " ); c1.CalculateArea();
        int r = c1.getRadius();
        C c2 = new C(r);
        c2.setRadius(10);
        System.out.println("Circumference of C 2 is " ); c2.CalculateArea();
    }
}
