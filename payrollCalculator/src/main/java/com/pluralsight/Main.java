package com.pluralsight;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("/Applications/Pluralsight/week-3/payrollCalculator/src/main/resources/employees.txt");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            while ((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double workHour = Double.parseDouble(tokens[2]);
                double rate = Double.parseDouble(tokens[3]);
                Employee e = new Employee( name,id, workHour, rate);
                e.displayData();

            }
            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
