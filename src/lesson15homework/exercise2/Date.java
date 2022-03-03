package lesson15homework.exercise2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDay(month, day) && isValidMonth(month) && isValidYear(year)) {
            setDay(month, day);
            setMonth(month);
            setYear(year);
        } else {
//    If it doesn't check at least one of the conditions, it shows the default date 1/1/1900
            this.day = 1;
            this.month = 1;
            this.year = 1900;
        }

    }

    public void setDay(int month, int day) {
        this.day = isValidDay(month, day) ? day : 1;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = isValidMonth(month) ? month : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = isValidYear(year) ? year : 1900;
    }

    public int getYear() {
        return year;
    }

    public boolean isValidDay(int month, int day) {
        if (day <= 1 || day >= 31) {
            System.out.println("The date is not in the range from 1 to 31. Please enter another date: ");
            return false;
        }

        if (month == 2 && day > 28) {
            System.out.println("February cannot be more than 28 days old. Please enter again:");
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("The month entered cannot be longer than 30 days. Please enter once more:");
            return false;
        }
        return true;
    }

    public boolean isValidMonth(int month) {
        if (month >= 1 && month <= 12) {
            return true;
        }
        System.out.println("The month must be in the range 1-12. Please enter again: ");
        return false;
    }

    public boolean isValidYear(int year) {
        if (year >= 1900) {
            return true;
        }
        System.out.println("The year must begin with 1900. Please enter: ");
        return false;
    }
}






