package lesson8homework.exercise2;

public class OperationsWithArrayElements {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 5, 6};
        int array1Length = array1.length;
        int rows = 2;
        int columns = 4;
        int array2[][] = {
                {1, 4, 7, 8},
                {2, 5, 9, 10}};
        int sum1 = 0;
        int sum2 = 0;
        int numberOdd1 = 0;
        int numberEven1 = 0;
        int numberOdd2 = 0;
        int numberEven2 = 0;
        for (int i = 0; i < array1Length; i++) {
            sum1 = sum1 + array1[i];
            if (array1[i] % 2 == 0) {
                numberOdd1++;
            } else {
                numberEven1++;
            }
        }
        System.out.println("sum1 = " + sum1);
        double average1 = ((double) sum1) / array1Length;
        System.out.println("average1 =" + average1);
        System.out.println("numberOld = " + numberOdd1);
        System.out.println("numberEven = " + numberEven1);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum2 = sum2 + array2[i][j];
                if (array2[i][j] % 2 == 0) {
                    numberOdd2++;
                } else {
                    numberEven2++;
                }
            }
        }
        System.out.println("sum2 = " + sum2);
        double average2 = ((double) sum2) / (rows * columns);
        System.out.println("average2 =" + average2);
        System.out.println("numberOld2 = " + numberOdd2);
        System.out.println("numberEven2 = " + numberEven2);
    }


}
