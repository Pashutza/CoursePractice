package lesson5homework.exercise1;

import java.util.Scanner;

public class ParityOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("The number '" + number + "' is " + pair(number));
    }

    private static String pair(int number) {
        if (number % 2 == 0) {
            return "odd";
        } else {
            return "even";
        }
    }

}
