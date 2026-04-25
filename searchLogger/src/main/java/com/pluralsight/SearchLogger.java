package com.pluralsight;

public class SearchLogger {
    public static void  search() {
        System.out.println("Enter term (X to Exit)");
        String term = scanner.nextLine();
        if (term.equalsIgnorCase("X")) {
            return;
        }
    }


}
