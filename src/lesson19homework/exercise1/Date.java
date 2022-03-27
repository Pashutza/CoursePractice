package lesson19homework.exercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 04, 21);
        LocalTime time = LocalTime.of(14, 25, 46);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(date);
        System.out.println(time);
        System.out.println(LocalDateTime.now().format(formatter));
    }
}
