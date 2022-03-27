package lesson19homework.exercise2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        boolean leap = false;
        if (year % 400 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else if (year % 4 == 0) {
            leap = true;
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
            scanner.close();
        }
    }
}

