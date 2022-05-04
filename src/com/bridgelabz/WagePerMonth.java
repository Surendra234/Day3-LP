package com.bridgelabz;

public class WagePerMonth {
    public static void main(String [] args) {

        //local variable
        int empRatePerHour = 20;
        int empHour = 0;
        int empWage = 0;
        int workingDay = 20;
        int wagePerMonth = 0;
        final int fullTime = 0;
        final int partTime = 1;

        for (int i = 1; i <= 20; i++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {

                case fullTime: empHour = 8;
                break;

                case partTime: empHour = 4;
                break;

                default: empHour = 0;
            }
            empWage = empHour * empRatePerHour;
            System.out.println("daily wage : " + empWage);
            wagePerMonth += empWage;
        }
        System.out.println("employee wage per month : " + wagePerMonth);
    }
}
