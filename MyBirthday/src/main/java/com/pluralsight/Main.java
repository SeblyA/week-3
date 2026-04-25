package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        // store input date as String

        //formatter for input (dd/mm/yyyy)
        System.out.println("Enter your Birthday (DD-MM-YYYY)");
      String input =scanner.nextLine();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //  Formatter for output (dd-MM-yyyy)
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert String to LocalDate
        LocalDate birthday = LocalDate.parse(input, inputFormatter);

        //  Format date into required pattern
        String formattedDate = birthday.format(outputFormatter);

        // STEP 6: Print final result
        System.out.println("This is my birthday " + formattedDate);
    }
}
