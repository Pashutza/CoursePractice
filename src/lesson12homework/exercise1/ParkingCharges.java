package lesson12homework.exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingCharges {
    public float calculateCharges(int hours){
        float maxSum = 10;
        float amount = 2;
        if(hours <=3){
            return amount;
        }

        for (int hour = 4; hour <= hours; hour++){
            amount += 0.5;
            if(amount >= maxSum ){
               amount = maxSum;
               break;
            }
        }

    return amount;
    }

    public float getTotalReceipts(List<Customer> customers){
        float receipts = 0;
        for(Customer customer : customers){
            receipts += customer.getFee();
        }
        return receipts;
    }

    public void showReport(List<Customer> customers){
        System.out.println("Total fee: " + getTotalReceipts(customers));
        System.out.format("%-10s %-20s %-15s %-10s %n","id","Registration Number","Hours", "Fee");
        for(Customer customer : customers){
            System.out.printf("%-15s %-15s %-15s %-10s %n",customer.getId(), customer.getRegistrationNumber(), customer.getHours(), customer.getFee());
        }

    }


    public List<Customer> getCustomers() {
        System.out.println("Enter customers");
        int customerID = 0;
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        do{
            System.out.println("Enter customer '"+ customerID +"':");
            Customer customer = new Customer(customerID);
            System.out.println(" Enter registration number:");
            customer.setRegistrationNumber(scanner.next());
            System.out.println(" Enter hours:");
            customer.setHours(scanner.nextInt());
            customer.setFee(calculateCharges(customer.getHours()));

            customers.add(customer);
            customerID++;

            System.out.println("Do you want to add a new customer? Y-Yes; N-No");
        } while (scanner.next().equalsIgnoreCase("Y"));
        scanner.close();

        return customers;
    }


}
