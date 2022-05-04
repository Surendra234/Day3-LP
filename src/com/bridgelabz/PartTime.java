package com.bridgelabz;

public class PartTime {
    public static void main(String[] args) {

        int fullTime = 0;
        int partTime = 1;
        int empRatePerHour = 20;
        int empHour = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if(empCheck == fullTime)
            empHour = 8;
        else if(empCheck == partTime)
            empHour = 4;
        else
            empHour = 0;

        empWage = empHour * empRatePerHour;
        System.out.println("empwage :" + empWage);
    }
}
