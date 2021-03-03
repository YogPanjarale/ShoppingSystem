package com.shoppingsystem;

import java.util.*;
public class Menu {
    public static void main(String[] args) {
        Menu1 menu = new Menu1();
        menu.products=new ArrayList<>();
        Menu1.input = new Scanner(System.in);
        Menu1.print("Welcome to Shopping System menu : ");
        Customer customer = menu.takeCustomer();
        menu.takeList();

    }
}
class Menu1 {
    public ArrayList<Product> products;
    private  static  int productCount=0;
    public static Scanner input;
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
        String name = input.next();
        print("Price of the product: ( just a number)");
        int price = input.nextInt();
        print("Product Added Successfully \nDetails: \nName: " + name + "\nPrice: " + price);
        Product product = new Product(name, price);
        System.out.println(product.name+product.price);
//        System.out.println(products);
        products.add(product);
//        productCount++;
//        products +=products;
//        products.add(products.size()+1,product);
        return product;
    }
    static void print(String text) {
        System.out.println(text);
    }
}