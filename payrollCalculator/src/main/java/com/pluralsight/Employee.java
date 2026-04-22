package com.pluralsight;

public class Employee {
    private String name;
    private int id;
    double workHour;
    double rate;

    public Employee(String name, int id, double workHour, double rate){
        this .name=name;
        this.id=id;
        this.workHour=workHour;
        this.rate=rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getWorkHour() {
        return workHour;
    }

    public int getId() {
        return id;
    }
    // calculate gross pay
    public double getGrossPay(){
        return workHour *rate;
    }
    public void displayData(){
        System.out.println(id+"|"+name+"|"+workHour+"|"+rate);

    }

}
