package lesson8homework.exercise4;

public class MaxMinArray {
    public static void main(String[] args) {
        int array[] = new int[]{1, -3, 5, 7, 2, 9};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Minimum value is:  " + min);
    }
}
