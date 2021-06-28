package com.company;

public abstract class Order {
    int OrderID;
    String CustomerName;
    String DeliverAddress;
    String CustomerOrder;
    float TotalOrderAmount;
    String OrderTime;
    abstract void Order(String OrderUp);
    abstract void Order(String Order, String Detail);
    abstract void UpdateOrderDetails();
    abstract void CancelOrder();
}
