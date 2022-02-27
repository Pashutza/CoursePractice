package lesson8homework.exercise5;

public class ArrayContainsValue {
    public static void main(String[] args) {
        int element = 5;
        int array[] = new int[]{0, 2, 3, 7, -2, 5};
        if (isFoundElementInArray(element, array)) {
            System.out.println(element+ " is found.");
        } else {
            System.out.println(element + " is not found.");
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
