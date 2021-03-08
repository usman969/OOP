package Homeactivity1;

public class Circle {
    public int radius ;
    public double pi;
    public Circle(){
    radius = 5; 
    pi = 3.4;
    }
    public Circle(int a, double b){
    radius = a;
    pi = b;
    }
    public double circumference(){
    return(2*pi*radius);
    }
}
