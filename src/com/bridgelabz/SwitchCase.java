package com.bridgelabz;

public class SwitchCase {

    public static void main(String[] args) {
        // local variable
        int empRatePerHour = 20;
        int empHour = 0;
        int empWage = 0;
        final int fullTime = 0; // In switch case constant expression is required
        final int partTime = 1;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch ((int) empCheck) {

            case fullTime: empHour = 8;
            break;

            case partTime: empHour = 4;
            break;

            default:empHour = 0;
        }
        empWage = empHour * empRatePerHour;
        System.out.println("employee salary : " + empWage);
    }
}
