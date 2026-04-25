package com.pluralsight;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        boolean running =true;

        while (running ){
            System.out.println("\n 1.Search");
            System.out.println("2.Exit");
            System.out.println("choose an option ");
                    int choice =read.nextInt();
                    read.nextLine ();
                    if (choice==1){
                        search();
                    }
                    else  if(choice==2){
                        Exit ();

            }



        }

        }
    }
