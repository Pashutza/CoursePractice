package lesson17homework.exercise3;

import java.util.Scanner;

public class StringReverse {
    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = scanner.nextLine();
        String reverse = new String("");

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of the string is: " + reverse);
    }

}

