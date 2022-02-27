package lesson9homework.exercise3;

import java.util.Scanner;


public class MainCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();
        char character = 'a';
        int counter = CounterCharecter.counterCharacter(word, character);
        System.out.println("Number of a's: " + counter);
        scanner.close();
    }
}
