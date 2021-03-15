package com.company;

public class rangle {
    private int length, width;
    public rangle() {
        length = 5; width = 2;
    }
    public rangle(int l, int w) {
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
