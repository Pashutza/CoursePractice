package lesson7homework.exercise2;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number ");
            int b = scanner.nextInt();
            System.out.println("The sum is: " + sum(a, b));
            System.out.println("Do you want to perform the operation again? Y or N");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Y"));

    }

    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
