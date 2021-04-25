public class Laptop extends PC{
    protected double length;
    protected double width;
    protected double height;
    protected double weight;
    public Laptop() {
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
    }
    public Laptop(double wordSize,double ms,double ss,double speed,double length,
                  double width, double height, double weight) {
        super(wordSize,ms,ss,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void display() {
        super.display();
        System.out.println("Length is "+length+"'Width is"+width+"Height is "+height+"Weight is "+weight);
    }
}
