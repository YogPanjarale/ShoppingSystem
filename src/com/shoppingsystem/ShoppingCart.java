package com.shoppingsystem;

import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public List<CartItem> items;
    public ShoppingCart(CartItem[] items){
        this.items= Arrays.asList(items);
    }
    public int cost(){
        int cost = 0;
        for (CartItem item:items) {
            cost+=item.cost();
        }
        return cost;
    }
    public void AddItem(CartItem i){
        items.add(i);
    }
}
