package com.company;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<String> myArray = new ArrayList<String>();
    static String ordertime;

    public static void main(String[] args) throws IOException {
        Calendar Time = Calendar.getInstance();
        SimpleDateFormat TimeFormat = new SimpleDateFormat("dd/MMM/yyyy @ HH:mm:ss");
        ordertime = TimeFormat.format(Time.getTime());
        char YN = 'n';
        do {
            OrderList Order = new OrderList();
            System.out.println("Enter 1 to pLace order.");
            System.out.println("Enter 2 to update order.");
            System.out.println("Enter 3 to cancel order.");
            System.out.println("Enter 4 to view orders.");
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            int Input = Integer.parseInt(buff.readLine());
            if (Input == 1) {
                Order.Order("OrderUp");
                System.out.println("Order entered.");
            } else if (Input == 2) {
                Order.Order("Order", "Detail");
                Order.UpdateOrderDetails();
            } else if (Input == 3) {
                Order.Order("Order", "Detail");
                Order.CancelOrder();
            } else if (Input == 4) {
                Order.Order("Order", "Detail");
            } else {
                System.out.println("Error 404 (Wrong Input).");
            }

            System.out.println("Return to main menu? (y/n):");
            YN = (char) buff.read();
        }
        while (YN == 'y' || YN == 'Y');
    }



}
