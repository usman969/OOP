package L11;

public class CalcArea {

    public static double[] Array_area(Shape[] Shapes) {
        double[] n = new double[Shapes.length];
        for (int i = 0; i < Shapes.length; i++) {
            if (Shapes[i] != null) {
                n[i] = Shapes[i].area();
            }
        }
        return n;
    }
}
