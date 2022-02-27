package lesson9homework.exercise2;

public class ShowEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Ioana", 2006, 1500, "Chișinău"),
                new Employee("Oliver", 2020, 13000, "Bălți"),
                new Employee("Lilia", 2015, 10000, "Orhei")
        };

        System.out.format("%-10s %-20s %-15s %-10s %n","Name","Year of joining","Salary", "Address");
        for(Employee employee : employees){
            System.out.printf("%-15s %-15s %-15s %-10s %n",employee.getName(),employee.getYearOfJoining(),
                    employee.getSalary(),employee.getAddress());
        }


    }
}
