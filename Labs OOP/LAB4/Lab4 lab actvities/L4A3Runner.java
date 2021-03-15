package com.company;

public class L4A3Runner {
    public static void main (String[] args){
        P p1 = new P();
        p1.setX(10);
        p1.setY(7);
        p1.display();
        P p2 = new P(10,11);
        p2.movePoint(2,3);
        p2.display();
    }
}
