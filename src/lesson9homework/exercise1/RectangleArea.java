package lesson9homework.exercise1;

import programHelp.Validator;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("The length of rectangle is:");
        Validator validator = new Validator();
        double length = validator.validateInput();
        System.out.println("The width of rectangle is:");
        double width = validator.validateInput();

        Area area = new Area();
        area.setDim(length, width);
        System.out.println("Area of rectangle is: " + area.getArea());

    }
}
