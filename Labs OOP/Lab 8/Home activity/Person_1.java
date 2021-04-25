package com.company;

public class Person_1 {
    protected String name;
    protected String address;
    protected String phone_number;
    protected String email_address;
    public Person_1(String name, String address, String phone_number, String email_address){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: " + address +
                "\nPhone Number: " + phone_number + "\nEmail Address: " + email_address);
    }
}