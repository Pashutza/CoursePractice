package lesson5homework.exercise3;

import java.util.Scanner;

public class TypeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        scanner.close();

        System.out.println("The number '" + number + "' is " + writeTypeOfNumber(number));

    }

    private static String writeTypeOfNumber(float number) {
        if (number == 0) {
            return "0";
        }
        float absNumber = Math.abs(number);
        if (absNumber < 1 && number > 0) {
            return "small and positive";
        }
        if (absNumber < 1 && number < 0) {
            return "small and negative";
        }
        if (absNumber > 1000000 && number > 0) {
            return "large and positive ";
        }
        if (absNumber > 1000000 && number < 0) {
            return "large and negative";
        }
        if (number > 1 && number < 1000000) {
            return "positive";
        }
        return "negative";

    }


}

