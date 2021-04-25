package com.company;

public class Staff extends Employee_1{
    protected String title;
    public Staff(String name, String address, String phone_number, String email_address, String office,
                 double salary, Date dateHired, String title){
        super(name,address,phone_number,email_address,office,salary,dateHired);
        this.title = title;
    }
    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}
