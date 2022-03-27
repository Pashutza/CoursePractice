package lesson19homework.exercise3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.parse("2022-01-24");
        LocalDate localDate2 = LocalDate.parse("2022-05-11");
        long numberOfDays = ChronoUnit.DAYS.between(localDate1, localDate2);
        System.out.println("The number of days is " + numberOfDays);

    }
}
