package lesson6homework.exercise1;

import java.util.Scanner;

public class CheckPorridge {
    public static void main(String[] args) {
        System.out.println("Enter the temperature: ");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        scanner.close();

        Porridge porridge = new Porridge();
        System.out.println(porridge.isGoodForEat(temperature));

    }
}
