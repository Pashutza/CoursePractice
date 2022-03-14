package lesson17homework.exercise2;

import java.util.Scanner;

public class NameAbreviate {
    public static void abreviateName() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        String[] arr = name.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i].charAt(0) + ". ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
