package com.shoppingsystem;

public class CartItem {
    public Customer customer;
    public Product product;
    public int count;

    public CartItem(Customer newCustomer, Product newProduct) {
        customer = newCustomer;
        product = newProduct;
    }

    public CartItem(Customer newCustomer, Product newProduct, int count) {
        this(newCustomer, newProduct);
        this.count = count;
    }

    public int cost() {
        return product.price * count;
    }

}
