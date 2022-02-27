package lesson8homework.exercise3;

public class CopyElementsArray {
    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 5, 7, 10};
        int array2[] = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.print("The elements for array2 are: {");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array2[i]);
            if (i < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }
}
