public class Pizza {
    private String pizza_size;
    private int nCT;
    private int nPT;
    private int nHT;

    public Pizza(){
    }
    public Pizza(String size_of_pizza, int cheese_toppings, int pepperoni_toppings, int ham_toppings){
        this.pizza_size = size_of_pizza;
        this.nCT = cheese_toppings;
        this.nPT = pepperoni_toppings;
        this.nHT = ham_toppings;
    }
    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }
    public String getPizza_size() {
        return pizza_size;
    }
    public void setNCT(int nCT) {
        this.nCT = nCT;
    }
    public int getNCT() {
        return nCT;
    }
    public void setNPT(int nPT) {
        this.nPT = nPT;
    }
    public int getNPT() {
        return nPT;
    }
    public void setNHT(int nHT) {
        this.nHT = nHT;
    }
    public int getNHT() {
        return nHT;
    }
    public double calcC(){
        if (pizza_size == "Small"){
            double pizza_cost = 10 + ((2 * nCT) + (2 * nPT)
                    + (2 * nHT));
            return pizza_cost;
        }
        else if(pizza_size == "Medium"){
            double pizza_cost = 12 + ((2 * nCT) + (2 * nPT)
                    + (2 * nHT));
            return pizza_cost;
        }
        else if(pizza_size == "Large"){
            double pizza_cost = 14 + ((2 * nCT) + (2 * nPT)
                    + (2 * nHT));
            return pizza_cost;
        }
        return 0;
    }
    public String getDescription(){
        return ("You ordered a " + pizza_size + " pizza with " + nCT +
                " cheese toppings," + nPT + " pepperoni toppings and "
                + nHT + " ham toppings");
    }
}
