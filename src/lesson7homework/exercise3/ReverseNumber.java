package lesson7homework.exercise3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter the positive number:");
            number = scanner.nextInt();
        } while (number <= 0);
        scanner.close();

        boolean display = false;
        do {
            if (display == false && number % 10 != 0) {
                display = true;
            }
            if (display) {
                System.out.print(number % 10);
            }
            number = number / 10;
        } while (number != 0);
    }
}
