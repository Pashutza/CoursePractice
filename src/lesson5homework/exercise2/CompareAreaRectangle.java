package lesson5homework.exercise2;

import java.util.Scanner;

public class CompareAreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of the first rectangle is a1:");
        double a1 = scanner.nextInt();
        System.out.println("the width of the first rectangle is b1:");
        double b1 = scanner.nextInt();
        System.out.println("The length of the second rectangle is a2:");
        double a2 = scanner.nextInt();
        System.out.println("The width of the second rectangle is b2:");
        double b2 = scanner.nextInt();
        scanner.close();

        double area1 = area(a1, b1);
        double area2 = area(a2, b2);
        System.out.println(compare(area1, area2));
    }

    private static double area(double a, double b) {
        return a * b;
    }

    private static String compare(double area1, double area2) {
        if (area1 == area2) {
            return "The areas of the rectangles are equal.";
        } else if (area1 > area2) {
            return "The area of the first rectangle is larger.";
        } else {
            return "The area of the first rectangle is smaller.";
        }
    }
}
