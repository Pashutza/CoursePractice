package lesson18homework.exercise1;

import java.util.ArrayList;

public class EmployeeService {
    public static ArrayList<Employee> filterEmployee(Employee[] employees) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getYearsOfActivity() >= 5) {
                list.add(employee);
            }
        }
        return list;
    }

    public static void printEmployees(ArrayList<Employee> list) {
        for (Employee employee : list) {
            if (list != null) {
                System.out.println(employee.getName() + " has " + employee.getYearsOfActivity() + " years of activity.");
            } else {
                System.out.println("There is no employee with at least 5 years of activity.");

            }
        }


    }
}
