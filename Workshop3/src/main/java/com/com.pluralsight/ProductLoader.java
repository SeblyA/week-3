package com.pluralsight;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class ProductLoader {
    ArrayList<Product> load(String fileName) {
        ArrayList <Product> products = new ArrayList<>();
        try{
            BufferedReader read =new BufferedReader (new FileReader("products.csv"));
            String line;
       while ((line =read.readLine())!=null) {
           String[] data = line.split(",");
           String sku = data[0];
           String productName = data[1];
           String department = data[2];
           double price = Double.parseDouble(data[3]);

           Product p = new Product(sku, productName, department, price);
           Product.add(p);
       }
       read.close();
   }catch (Exception e){
           System.out.println("Invalid choice");
           e.printStackTrace();
     }
        return Product;
    }
}