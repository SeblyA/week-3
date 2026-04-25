package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter todays date (MM/DD/YYYY ");
        String userInput =scanner.nextLine();

        //creat formatter   & //parse innput
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(userInput, inputFormatter);

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(d1));
        System.out.println(date);  //  d2 run (yyyy-MM-dd)

        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        System.out.println(date.format(d3));
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");

        String formattedDate = today.format(fmt);
        System.out.println(formattedDate);
        DateTimeFormatter tmf = DateTimeFormatter.ofPattern("HH:mm  EEEE, MMM dd, yyyy ");
        String dates =today.format(tmf);
        System.out.println(dates);










    }
}

