package com.bridgelabz;

public class TotalHour_TotalDays {
    public static void main(String[] args) {

        final int fullTime = 0;
        final int partTime = 1;
        int empRatePerHour = 20;
        int empHour = 0;
        int empWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHour = 0;

        while(totalEmpHour <= 100 && totalWorkingDays <= 19) {
            totalWorkingDays++ ;

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch(empCheck) {

                case fullTime: empHour = 8;
                break;

                case partTime: empHour = 4;
                break;

                default: empHour = 0;
            }
            totalEmpHour += empHour;
            System.out.print("Days : " + totalWorkingDays);
            System.out.println(" emp hours : " +empHour);
        }
        int totalEmpWage = 0;
        totalEmpWage = totalEmpHour * empRatePerHour;
        System.out.println("Total employee wage : " +totalEmpWage);
    }
}
