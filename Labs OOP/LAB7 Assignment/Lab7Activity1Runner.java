public class Lab7Activity1Runner {
    public static void main(String[] args) {
        System.out.println("You can place maximum 3 orders");

        Pizza pizzaNo1 = new Pizza("Small",2,5,3);
        System.out.println(pizzaNo1.getDescription() + " for Rs." + pizzaNo1.CalculateCost());

        Pizza pizzaNo2 = new Pizza();
        pizzaNo2.setPizza_size("Medium");
        pizzaNo2.setNCT(8);
        pizzaNo2.setNPT(8);
        pizzaNo2.setNHT(5);
        System.out.println(pizzaNo2.getDescription() + " Cost of this pizza is :" + pizzaNo2.CalculateCost());

        Pizza pizzaNo3 = new Pizza("Large",8,8,8);
        System.out.println(pizzaNo3.getDescription() + " Cost of this pizza is :" + pizzaNo3.CalculateCost());

        PizzaOrder pizzaOrder_1 = new PizzaOrder(pizzaNo1);
        PizzaOrder pizzaOrder_2 = new PizzaOrder(pizzaNo2);
        PizzaOrder pizzaOrder_3 = new PizzaOrder(pizzaNo3);

        System.out.println("Total Bill = " + PizzaOrder.calculateTotal());
    }
}
