package com.company;

public class Employee_1 extends Person_1{
    protected String office;
    protected double salary;
    protected Date date_hired;
    public Employee_1(String name, String address, String phone_number, String email_address, String office,
                      double salary,Date date_hired){
        super(name,address,phone_number,email_address);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    public void display(){
        super.display();
        System.out.println("Office: " + office + "\nSalaary: " + salary + "\nDate of Hire: " + date_hired.display());
    }
}
