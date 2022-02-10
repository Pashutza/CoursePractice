package lesson7homework.exercise1;

public class NumbersDivisibleBy30 {
    public static void main(String[] args) {
        for (int i = 100, j = 1; i <= 1000; i++) {
            if (i % 30 == 0) {
                if(j % 10 != 0){
                    System.out.print(i + " ");
                } else {
                    System.out.println(i + " ");
                }
                j++;
            }
        }
    }
}
