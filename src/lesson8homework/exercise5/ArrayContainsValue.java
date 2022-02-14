package lesson8homework.exercise5;

public class ArrayContainsValue {
    public static void main(String[] args) {
        int element = 7;
        int array[] = new int[]{0, 2, 3, 7, -2, 5};
        if (isFoundElementInArray(element, array)) {
            System.out.println("Value found");
        } else {
            System.out.println("Value not found.");
        }
    }

    private static boolean isFoundElementInArray(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
