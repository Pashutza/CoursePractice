package lesson5homework.exercise1;

import java.util.Scanner;

public class ParityOfNumber {
    public static void main(String[] args) {
        System.out.println("Introdu numarul: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Numarul '" + number + "' este " + pair(number));
    }

    private static String pair(int number) {
        if (number % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }

}
