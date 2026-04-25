package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                // ===== ARRAYS (fixed size collections) =====
                String[] phoneModels = {"iPhone 7", "iPhone 8", "iPhone 11"};
                int[] numbers = {1, 2, 4, 5};
                int[] phonePrices = {888, 222, 333};

                // ===== ARRAYLIST (dynamic collection) =====
                // Can grow/shrink and has useful methods like add(), remove(), clear()
                ArrayList<Product> products = new ArrayList<>();

                // Add products to the list
                products.add(new Product("iPhone 15", 999, "Apple"));
                products.add(new Product("iPhone 15", 999, "Apple"));
                products.add(new Product("Galaxy S24", 899, "Samsung"));
                products.add(new Product("Pixel 8", 799, "Google"));
                products.add(new Product("iPhone 18", 799, "Apple"));

                // ===== REMOVE ITEM =====
                // Remove product at index 1 (second item in the list)
                products.remove(1);

                System.out.println("After removal:");
                System.out.println(products.get(2)); // Print product at index 2

                // ===== USER INPUT =====
                Scanner reader = new Scanner(System.in);
                System.out.print("Search for a product by index: ");
                int input = reader.nextInt();

                // ===== SEARCH BY INDEX =====
                if (input >= 0 && input < products.size()) {
                    System.out.println("Found item: " + products.get(input));
                } else {
                    System.out.println("Invalid index.");
                }

                // ===== LOOP THROUGH LIST (ENHANCED FOR LOOP) =====
                System.out.println("\nAll iPhone 15 products:");

                for (Product p : products) {

                    // IMPORTANT: Use .equals() for String comparison (NOT ==)
                    if (p.getName().equals("iPhone 15")) {
                        System.out.println(p);
                    }
                }

                // ===== PRINT FULL LIST =====
                System.out.println("\nAll products:");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(i + " : " + products.get(i));
                }

                // Always close Scanner to prevent resource leaks
                reader.close();
            }
        }



