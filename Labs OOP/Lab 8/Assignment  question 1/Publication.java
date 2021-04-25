package com.company;

public class Publication {
    protected String title;
    protected double price;
    public Publication(){
    }
    public Publication(String Title,double Price){
        this.title = Title;
        this.price = Price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void display(){
        System.out.println(title + " for $ " + price);
    }
}
