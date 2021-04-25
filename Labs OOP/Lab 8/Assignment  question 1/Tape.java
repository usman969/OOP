public class Tape extends Publication{
    protected String PT;
    public Tape(){
    }
    public Tape(String Title,double Price,String PlayingTime){
        super(Title,Price);
        this.PT = PlayingTime;
    }
    public void setPT(String PT) {
        this.PT = PT;
    }
    public String getPT() {
        return PT;
    }
    public void display() {
        super.display();
        System.out.println("Time since playing is " + PT);
    }
}
