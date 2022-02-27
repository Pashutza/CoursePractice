package lesson12homework.exercise2;

public class PrimeNumber {
    public void showNumberOfPrimeNumbers(int number) {
        int counter = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                counter++;
            }
        }
        System.out.println("The number of all prime numbers less than 10,000 are: " + counter);
    }

    public boolean isPrime(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
