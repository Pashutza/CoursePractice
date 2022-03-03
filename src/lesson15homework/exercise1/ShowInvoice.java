package lesson15homework.exercise1;

public class ShowInvoice {

    public static void showInvoiceAndAmound() {
        Invoice car = new Invoice("BMW", "Car", 2, 84000);
        System.out.println(car);
        System.out.println("Total amound: " + car.getAmound() + "$");

        Invoice telefon = new Invoice("Oppo", "Smart", -5, 350);
        System.out.println(telefon);
        System.out.println("Total amound: " + telefon.getAmound() + "$");

        Invoice headphones = new Invoice("Samsung", "Smart", 6, 220);
        System.out.println(headphones);
        System.out.println("Total amound: " + headphones.getAmound() + "$");
    }

}
