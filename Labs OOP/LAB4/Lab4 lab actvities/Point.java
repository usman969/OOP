package com.company;

public class P {
    private int x;
    private int y;
    public P(){
        x=0;
        y=0;
    }
    public P(int a, int b){
        x=a;
        y=b;
    }
    public void setX(int a){
        x=a;
    }
    public void setY(int b){
        y=b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.println("x coordinate = "+x+" y coordinate = "+y);
    }
    public void movePoint(int a , int b){
        x=x+a;
        y=y+b;
        System.out.println("x coordinate after moving = "+x+" y coordinate after moving = "+y);
    }
}
