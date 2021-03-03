package com.shoppingsystem;

public class Customer {
    static  int count=0;
    public int id;
    public String name;
    public String address;
    public Customer(String newName, String newAddress ){
        id = count;
        name=newName;
        address=newAddress;
        count++;
    }
}
