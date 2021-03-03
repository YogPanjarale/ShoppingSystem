package com.shoppingsystem;

public class Product {
    static int count=0;
    public int id;
    public int price;
    public String name;
    public Product(String newName, int newPrice){
        name = newName;
        price= newPrice;
    }
}
