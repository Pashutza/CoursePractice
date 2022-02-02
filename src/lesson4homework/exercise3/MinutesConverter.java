package lesson4homework.exercise3;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 525600l;
        double days = minutes / 60 / 24;
        double years = days / 365;
        System.out.println("days = " + days);
        System.out.println("years = " + years);

    }
}
