package lesson9homework.exercise4;

import java.util.Scanner;

public class Pin {
    private static final String password = "1111";
    public static String readPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password:");
        return scanner.next();
    }

    public static boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public static void logIn() {
        int maxAttempts = 3;
        for (int i = 0; i < maxAttempts; i++) {
            String inputPassword = readPassword();
            if (checkPassword(inputPassword)) {
                System.out.println("Correct, welcome back.");
                return;
            } else {
                if(i != maxAttempts -1){
                    System.out.println("Incorrect password! try again...");
                }
                continue;
            }
        }
        System.out.println("Sorry but you have looked out.");
    }
}
