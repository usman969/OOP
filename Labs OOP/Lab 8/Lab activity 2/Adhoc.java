package com.company;

public class Adhoc extends Employee{
    private int numberOfWorkingDays;
    private int wage;
    public Adhoc(String name, String phone, String address, int allowance, int
            numberOfWorkingDays, int wage)
    {
        super(name, phone, address, allowance);
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.wage = wage;
    }
    public void Display()
    {
        System.out.println("Name: " + name + "\nPhone Number: " + phone +"\nAddress: " + address
                + "\nAllowance: " + allowance + "\nNumber Of Working Days: " +
                numberOfWorkingDays + "\nWage: " + wage);
    }

}
