package L11;

public class Runner {
    public static void main(String[] args) {
        Shape[] Shapes=new Shape[5];
        Shapes[0]=new circle(4.7);
        Shapes[2]=new rectangle(20,14);
        Shapes[3]=new triangle(14,7);
        Shapes[4]=new triangle(14,4);
        
           double arr_Area[] = CalcArea.Array_Area(Shapes);
            for(double Area: arr_Area) {
                System.out.println(Area);
            }
    }
}
