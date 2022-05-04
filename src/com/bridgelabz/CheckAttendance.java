package com.bridgelabz;

public class CheckAttendance {
    public static void main(String[] args) {
        int fullTime = 0;
        double attendance = Math.floor(Math.random() * 10) % 2;

        if(attendance == fullTime) {
            System.out.println("emp is present");
        } else
            System.out.println("emp is absent");
    }
}
