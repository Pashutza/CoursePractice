package lesson18homework.exercise1;

public class Employee {
    private String name;
    private int yearsOfActivity;

    public Employee(String name, int yearsOfActivity) {
        this.name = name;
        setYearsOfActivity(yearsOfActivity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(int yearsOfActivity) {
        if (yearsOfActivity > 0) {
            this.yearsOfActivity = yearsOfActivity;
        } else {
            this.yearsOfActivity = 0;
        }
    }
}
