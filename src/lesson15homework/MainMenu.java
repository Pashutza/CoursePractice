package lesson15homework;

import lesson15homework.exercise1.ShowInvoice;
import lesson15homework.exercise2.ShowData;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n;

            System.out.println("------------------------------------------------------------------------------");
            System.out.println("This is the menu for Lesson 15. Enter the value depending on the action: ");
            System.out.println("1. Run the exercise 1(Show Invoice).");
            System.out.println("2. Run the exercise 2(Show Date).");
            System.out.println("3. Exit the Main Menu");
            System.out.println("------------------------------------------------------------------------------");
            n = scanner.nextInt();
            
            switch (n) {
                case 1:
                    ShowInvoice.showInvoiceAndAmound();
                    break;
                case 2:
                    ShowData.show();
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("You entered an invalid value");

            }
        }
    }
}
