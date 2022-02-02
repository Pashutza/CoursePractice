package lesson4homework.exercise2;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 4.3;
        double tax = 3.5;
        int quantity = 350;
        double total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);

    }
}
