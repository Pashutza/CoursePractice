package lesson10homework.exercise3;

public class ConvertString {
    public static void main(String[] args) {
        Boolean boolean1 = Boolean.valueOf("tRue");
        boolean boolean2 = boolean1;
        System.out.println("Value of boolean1: " + boolean1);
        System.out.println("Value of boolean2: " + boolean2);

        Byte byte1 = Byte.valueOf("120");
        byte byte2 = byte1;
        System.out.println("Value of byte1: " + byte1);
        System.out.println("Value of byte2: " + byte2);

        Short short1 = Short.valueOf("32000");
        short short2 = short1;
        System.out.println("Value of short1: " + short1);
        System.out.println("Value of short2: " + short2);

        Integer int1 = Integer.valueOf("147895632");
        int int2 = int1;
        System.out.println("Value of int1: " + int1);
        System.out.println("Value of int2: " + int2);

        Long long1 = new Long("987654321987654321");
        long long2 = long1;
        System.out.println("Value of long1: " + long1);
        System.out.println("Value of long2: " + long2);

        Double double1 = Double.valueOf("4444.5d");
        double double2 = double1;
        System.out.println("Value of double1: " + double1);
        System.out.println("Value of double2: " + double2);

        Float float1 = Float.valueOf("2354.56f");
        float float2 = float1;
        System.out.println("Value of float1: " + float1);
        System.out.println("Value of float2: " + float2);


    }
}
