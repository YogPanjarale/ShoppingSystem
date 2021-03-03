package com.shoppingsystem;

import java.util.*;

public class Menu {
    private static Scanner input;

    public ArrayList<Product> products;
    private  static  int productCount=0;
    public static void main(String[] args) {
        this.products=new ArrayList<Product>();
        input = new Scanner(System.in);
        print("Welcome to Shopping System menu : ");
        Customer customer = takeCustomer();
        takeList();

    }


    static void print(String text) {
        System.out.println(text);
    }

    public static Customer takeCustomer() {
        print("Add a customer");
        print("Tell us your name: ");
        String name = input.nextLine();
        print("Tell us your address: ");
        String address = input.nextLine();
        print("You are now registered as a customer your details are:\nName: " + name + "\nAddress: " + address);
        return new Customer(name, address);
    }

    public void takeList() {
        print("\nAdd product list");
        boolean exit = false;
        while (!exit) {
            print("Type a to add Product");
            print("Type e to exit");
            char a = input.nextLine().charAt(0);
            switch (a){
                case 'a':
                    Product item= takeItem();
                    break;
                case 'e':
                    exit=true;
                    break;
                default:
                    print("Your input did not match 'a' or 'e' ");
            }
        }
    }

    public  Product takeItem() {
        print("Add a Product");
        print("Name of Product: ");
        String name = input.nextLine();
        print("Price of the product: ( just a number)");
        int price = input.nextInt();
        print("Product Added Successfully \nDetails: \nName: " + name + "\nPrice: " + price);
        Product product = new Product(name, price);
        System.out.println(product.name+product.price);
//        System.out.println(products);
        this.products.add(product);
//        productCount++;
//        products +=products;
//        products.add(products.size()+1,product);
        return product;
    }
}
