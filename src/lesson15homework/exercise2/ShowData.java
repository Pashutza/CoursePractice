package lesson15homework.exercise2;

public class ShowData {
    public static void show() {
        Date date = new Date(24, 1, 2022);
        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
