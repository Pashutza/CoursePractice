package lesson8homework.exercise1;

import java.util.Scanner;

public class ShowArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length:");
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element [" + i + "]:");
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print("The elements for array are: {");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }

}
