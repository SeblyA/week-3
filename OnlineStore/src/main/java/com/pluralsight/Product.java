package com.pluralsight;

public class Product{
    private String name;// store product name
    private double price;//store price
//Constructor
    public Product(String name, double price) {
        // checking item no empty
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        //check price > 0
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
        //save clean name and price
        this.name = name.trim();
        this.price = price;
    }
    // letting classes get the name
    public String getName() {
        return name;
    }
    //(String name) name can be updated
    public void setName(String name) {
        this.name = name;
    }
    //let other class read the price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override // Run the code
    public String toString() {
        return "Product Name: "+name + " price -> $"+ String.format("%.2f",price);

    }
}
