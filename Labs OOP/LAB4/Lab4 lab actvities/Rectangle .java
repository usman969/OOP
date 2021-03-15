package com.company;

public class Rectangle {
    private int length, width;
    public Rectangle() {
        length = 5; width = 2;
    }
    public Rectangle(int l, int w) {
        length = l; width = w;
    }
    public void setLength(int l) {
        length = l;
    }
    public void setWidth(int w) {
        width = w;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public int area () {
        return (length*width);
    }
}
