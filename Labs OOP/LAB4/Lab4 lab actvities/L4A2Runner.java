package com.company;

public class L4A2Runner {
    public static void main (String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is " + rect.area());
        System.out.println("Width of Rectangle is " + rect.getWidth());
    }
}