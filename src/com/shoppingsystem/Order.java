package com.shoppingsystem;

public class Order {
    static int count;
    public int id;
    public int amount;
    public ShoppingCart cart;
    public Order(ShoppingCart cart){
        this.cart=cart;
    }
}
