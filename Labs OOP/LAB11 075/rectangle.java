package L11;

public class rectangle implements Shape {

    private int l;
    private int w;
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    public double Area() {
       return l * w;
    }
}
