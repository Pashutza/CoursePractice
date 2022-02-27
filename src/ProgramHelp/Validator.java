package ProgramHelp;

import java.util.Scanner;

public class Validator {

    public double validateInput() {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();

        while (input <= 0) {
            System.out.println("Negative values or zero are not accepted");
            System.out.println("Enter the value again: ");
            input = scanner.nextDouble();
        }
        return input;
    }
}

