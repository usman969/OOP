package com.company;

public class Student_1 extends Person_1{
    protected String status;
    public Student_1(String name, String address, String phone_number, String email_address,String status){
        super(name,address,phone_number,email_address);
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
