package lesson17homework;

import lesson17homework.exercise1.StringIgnoreCase;
import lesson17homework.exercise2.NameAbbreviate;
import lesson17homework.exercise3.StringReverse;
import lesson17homework.exercise4.NumberOfWords;

import java.util.Scanner;

public class MainMenuLesson17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n;

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("This is the menu for Lesson 17. Enter the value depending on the action: ");
            System.out.println("1. Run the exercise 1(Compare String).");
            System.out.println("2. Run the exercise 2(Displays the abbreviations of the first and middle names).");
            System.out.println("3. Run the exercise 3(Reverce String).");
            System.out.println("4. Run the exercise 4(Count the number of words).");
            System.out.println("5. Exit the Main Menu");
            System.out.println("-------------------------------------------------------------------------------");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    StringIgnoreCase.compareString();
                    break;
                case 2:
                    NameAbbreviate.abbreviateName();
                    break;
                case 3:
                    StringReverse.reverseString();
                    break;
                case 4:
                    NumberOfWords.countNumberOfWordsInString();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("You entered an invalid value");

            }
        }
    }


}
