package com.company;

public class C {
    private int R;
    public C() {
        R=7;
    }
    public C(int r) {
        R=r;
    }
    public void setRadius(int r) {
        R=r;
    }
    public int getRadius(){
        return R;
    }
    public void display() {
        System.out.println("R = "+R);
    }
    public void CalculateArea() {
        double a = (3.14*R*R);
        System.out.println("Area = " + a);
    }
}

