package com.company;

public class Book extends Publication{
    protected double page_count;
    public Book(){
    }
    public Book(String Title,double Price,double pgct){
        super(Title,Price);
        this.page_count = pgct;
    }
    public void setPage_count(double page_count) {
        this.page_count = page_count;
    }
    public double getPage_count() {
        return page_count;
    }
    public void display() {
        super.display();
        System.out.println("Page count = " + page_count);
    }
}
