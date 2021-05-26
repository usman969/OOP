package L11;

public class circle implements Shape {
    private double r;
    circle(double r){
        this.r=r;
    }
    public double Area() {
        return Math.PI * Math.pow(r, 2);
    }   
}
