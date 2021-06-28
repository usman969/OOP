package com.company;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class OrderList extends Order implements Comparable <OrderList> {
    private int OrderID;
    private String CustomerName;
    private String DeliverAddress;
    private String CustomerOrder;
    private float TotalOrderAmount;
    private String OrderTime;
    Main main = new Main();

    OrderList() {}
    @Override
    public int compareTo(OrderList ord){
        return this.OrderID = ord.OrderID;
    }

    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    OrderList(int OrderID,String CustomerName,String DeliverAddress,String CustomerOrder,float TotalOrderAmount, String OrderTime){
        this.OrderID=OrderID;
        this.CustomerName=CustomerName;
        this.DeliverAddress=DeliverAddress;
        this.CustomerOrder=CustomerOrder;
        this.TotalOrderAmount=TotalOrderAmount;
        this.OrderTime = OrderTime;
    }

    void Order(String OrderUp){

        try {

            OrderList orders = new OrderList();
            @SuppressWarnings("static-access")
            int OrderID= main.myArray.size();

            System.out.println("Enter name:");
            orders.CustomerName = buff.readLine();
            System.out.println("Enter delivery address:");
            orders.DeliverAddress = buff.readLine();

            System.out.println("Enter order:");
            orders.CustomerOrder = buff.readLine();

            System.out.println("Enter the total order amount:");
            orders.TotalOrderAmount = Float.parseFloat(buff.readLine());

            BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\data_file_no.txt"));
            int d=0;
            d=Integer.parseInt(bf.readLine())+1;

            File f=new File("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\"+String.valueOf(d)+".txt");
            Scanner sc=new Scanner(System.in);
            orders.OrderTime = main.ordertime;

            String detail=orders.CustomerName+"           "+orders.DeliverAddress+"              "+orders.CustomerOrder+"            "+orders.TotalOrderAmount+"        "+String.valueOf(d)+"               "+orders.OrderTime;
            orders.OrderID=d;

            PrintWriter pw=new PrintWriter(f);
            pw.print(detail);
            pw.close();

            PrintWriter pww=new PrintWriter("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner \\data_file_no.txt");
            int increasing_no=d;
            pww.print(increasing_no);
            pww.close();

        }

        catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }


    }

    void Order(String Order, String Detail){
        main.myArray.clear();
        int d=0;

        try{BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\data_file_no.txt"));
            d=Integer.parseInt(bf.readLine());}
        catch(Exception ec) {
            System.out.println("file not found");
        }
        List<Integer> arrlist = new ArrayList<Integer>();

        try{BufferedReader bff=new BufferedReader(new FileReader("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\Delete_Ids.txt"));
            String f="";
            while ((f=bff.readLine())!=null){
                arrlist.add(Integer.parseInt(f));
            }
        }
        catch(Exception ec) {
            System.out.println("file not found");
        }
        for(int i=1;i<d+1;i++){

            if(arrlist.contains(i)==true){
                continue;
            }

            String read=null;
            try{BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\"+String.valueOf(i)+".txt"));
                read=bf.readLine(); }
            catch(Exception ec) {
                System.out.println("file not found");
            }
            main.myArray.add(read);
        }



        for(int i=0; i<main.myArray.size(); i++){
            System.out.println("-------------------------------------------");
            System.out.println("Customer-Name  Customer-Address  Customer-Order  Total-Price  Order-ID 	    Date/Time");
            System.out.println(main.myArray.get(i));
            System.out.println("-------------------------------------------");
        }
    }

    void UpdateOrderDetails(){

        try {
            OrderList orders = new OrderList();
            @SuppressWarnings("static-access")
            int OrderID= main.myArray.size();

            System.out.println("Enter ID:");
            int id = Integer.parseInt(buff.readLine());

            System.out.println("Enter name:");
            orders.CustomerName = buff.readLine();

            System.out.println("Enter delivery address:");
            orders.DeliverAddress = buff.readLine();

            System.out.println("Enter order:");
            orders.CustomerOrder = buff.readLine();

            System.out.println("Enter the total order amount:");
            orders.TotalOrderAmount = Float.parseFloat(buff.readLine());
            orders.OrderTime = main.ordertime;

            String detail=orders.CustomerName+"       "+orders.DeliverAddress+"   "+orders.CustomerOrder+"   "+orders.TotalOrderAmount+"    "+String.valueOf(id)+"     "+orders.OrderTime;
            PrintWriter pw=new PrintWriter("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\"+String.valueOf(id)+".txt");
            pw.print(detail);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    void CancelOrder() {

        try {
            System.out.println("Write ID");
            Scanner sc=new Scanner(System.in);
            String id=sc.next();
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\Delete_Ids.txt",true));
            bw.write(id+"\n");
            bw.close();
            File f=new File("C:\\Users\\Syed Aon Haider\\IdeaProjects\\finalProject_Runner\\"+id+".txt");
            f.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
