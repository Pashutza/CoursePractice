package lesson17homework.exercise4;

import java.util.Scanner;

public class NumberOfWords {
    public static void countNumberOfWordsInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();

        int count = 1;

        for (int i = 0; i < string.length() - 1; i++) {
            if ((string.charAt(i) == ' ') && (string.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("The string has " + count + " words.");
    }
}

