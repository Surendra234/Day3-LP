package com.bridgelabz;

public class DailyWage {
    public static void main(String[] args) {
        int fullTime = 0;
        int empHour = 0;
        int empRatePerHour = 20;
        int empWage ;

        // *10 is taken for single digit from 0 to 9
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if(empCheck == fullTime)
            empHour = 8;  // local variable can be change
        else
            empHour = 0;

        empWage = empHour * empRatePerHour;
        System.out.println("Daily employee wage :  " + empWage);
    }
}
