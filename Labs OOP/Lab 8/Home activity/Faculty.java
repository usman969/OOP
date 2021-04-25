package com.company;

public class Faculty extends Employee_1{
    protected int office_hours;
    protected String rank;
    public Faculty(String name, String address, String phone_number, String email_address, String office,
                   double salary, Date date_hired, int office_hours, String rank){
        super(name,address,phone_number,email_address,office,salary,date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    public void display() {
        super.display();
        System.out.println("Office hours: " + office_hours + "\nRank: " + rank);
    }
}
