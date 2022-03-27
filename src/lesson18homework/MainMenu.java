package lesson18homework;

import lesson18homework.exercise1.Employee;
import lesson18homework.exercise1.EmployeeService;
import lesson18homework.exercise2.Collection;
import lesson18homework.exercise3.Dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n;

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("This is the menu for Lesson 18. Enter the value depending on the action: ");
            System.out.println("1. Run the exercise 1.");
            System.out.println("2. Run the exercise 2.");
            System.out.println("3. Run the exercise 3.");
            System.out.println("4. Exit the Main Menu.");
            System.out.println("-------------------------------------------------------------------------------");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    Employee Ion = new Employee("Ion", 5);
                    Employee Mia = new Employee("Mia", -7);
                    Employee Oliver = new Employee("Oliver", 10);
                    Employee OLga = new Employee("Olga", -2);
                    Employee[] employees = {Ion, Mia, Oliver, OLga};
                    ArrayList<Employee> list = EmployeeService.filterEmployee(employees);
                    EmployeeService.printEmployees(list);


                    break;
               case 2:
                   String stringList[] = {"Set","Map", "List", "List", "List", "Map", "List"};
                   Collection.showCollectionOfUnicValue(stringList);

                    break;
                case 3:
                    Dictionary.simulateDictionary();
                    break;

                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("You entered an invalid value");

            }
        }
    }


}

