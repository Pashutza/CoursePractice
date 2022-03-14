package lesson17homework.exercise2;

import java.util.Scanner;

public class NameAbbreviate {
    public static void abbreviateName() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] array = name.split(" ");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i].charAt(0) + ". ");
        }
        System.out.println(array[array.length - 1]);
    }
}
