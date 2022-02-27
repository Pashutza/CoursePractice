package lesson9homework.exercise1;

import ProgramHelp.Validator;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The length of rectangle is:");
        Validator validator = new Validator();
        double length = validator.validateInput();
        System.out.println("The width of rectangle is:");
        double width = validator.validateInput();
        scanner.close();

        Area area = new Area();
        area.setDim(length, width);
        System.out.println("Area of rectangle is: " + area.getArea());

    }
}
