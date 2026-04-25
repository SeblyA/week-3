package com.pluralsight;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<product> products = new ArrayList<>();//Dynamic collection ArratList
        //product list
        products.add(new product("Rav4 ",10000,"Toyota "));
        products.add(new product("ModelY ",20000,"Tesla "));
        products.add(new product("Escape ",15000,"Ford "));
        products.add(new product("Camry ",12000,"Toyota "));
        products.add(new product("Pathfinder  ",25000,"Nissan "));
        for (product p: products ){
            System.out.println("\n All products ");
            for (int i =0; 1<products.size();i++){
                System.out.println(i  + "| " + products.get());
            }
        }


        }
    }
