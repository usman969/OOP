public class PizzaOrder {
    static Pizza[] a1 = new Pizza[3];
    private static int x = 0;
    public PizzaOrder(Pizza pizza){
        a1[x] = pizza;
        x++;
    }
    public static double calculateTotal() {
        double Receipt = 0;
        for(int y = 0; y < x; y++){
            double Receipt1 = a1[y].CalculateCost();
            Receipt = Receipt + Receipt1;
        }
        return Receipt;
    }
}
