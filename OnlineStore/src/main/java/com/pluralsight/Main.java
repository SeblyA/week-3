package com.pluralsight;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Poducts of Array List
        ArrayList<Product> products = new ArrayList<>();
// creat products
        Product p1 = new Product("Shirt", 29.90);
        Product p2 = new Product("Pant", 90.90);
        Product p3 = new Product("Socks",19.90);
//Adding product to list
        products.add(p1);
        products.add(p2);
        products.add(p3);

// creat empty cart
        Cart cart = new Cart();
//Add product to the cart
        cart.addProduct(products.get(0));
        cart.addProduct(products.get(0));
        cart.addProduct(products.get(1));
        cart.addProduct(products.get(2));

        System.out.println("Cart items:");
        for (Product product : cart.getItems()) {
            System.out.println(product);
        }

        System.out.println("------------------");
        System.out.printf("Total: $%.2f%n", cart.getTotalPrice());

        System.out.println("Item count: " + cart.getItemCount());
    }
}

