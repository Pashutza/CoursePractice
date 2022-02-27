package lesson9homework.exercise2;

public class Employee {
    private String name;
    private int yearOfJoining;
    private int salary;
    private String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary= salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getSalary(){return salary;}

    public String getAddress() {
        return address;
    }
}
