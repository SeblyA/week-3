package com.pluralsight;

public class Product {
    private String name;
    private double price;
    private String brand;

    // Constructor
    public Product(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    // toString (for clean printing)
    @Override
    public String toString() {
        return brand + " " + name + " - $" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price > 0 ) {
            this.price = price;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

