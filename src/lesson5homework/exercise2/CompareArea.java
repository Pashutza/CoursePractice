package lesson5homework.exercise2;

import java.util.Scanner;

public class CompareArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lungimea pentru primul dreptunghi este a1:");
        double a1 = scanner.nextInt();
        System.out.println("Latimea pentru primul dreptunghi este b1:");
        double b1 = scanner.nextInt();
        System.out.println("Lungimea pentru al doilea dreptunghi este a2:");
        double a2 = scanner.nextInt();
        System.out.println("Latimea pentru al doilea dreptunghi este b2:");
        double b2 = scanner.nextInt();
        scanner.close();

        double area1 = area(a1, b1);
        double area2 = area(a2, b2);
        System.out.println(compare(area1 ,area2));
    }

    private static double area(double a, double b){
        return a * b;
    }

    private static String compare(double area1, double area2){
        if(area1 == area2){
            return "Suprafetele dreptunghiurilor sunt egale.";
        } else if(area1 > area2){
            return "Suprafata primului dreptunghi este mai mare.";
        } else {
            return "Suprafata primului dreptunghi este mai mic.";
        }
    }
}
