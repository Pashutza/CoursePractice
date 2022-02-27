package lesson12homework.exercise1;

import lesson12homework.exercise1.Customer;
import lesson12homework.exercise1.ParkingCharges;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
        List<Customer> customers = parkingCharges.getCustomers();
        parkingCharges.showReport(customers);



    }

}
