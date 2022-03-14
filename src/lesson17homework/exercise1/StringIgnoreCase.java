package lesson17homework.exercise1;

public class StringIgnoreCase {
    public static void compareString() {
        String string1 = "String Ignore Case";
        String string2 = "string ignore case";
        boolean compare = string1.equalsIgnoreCase(string2);
        System.out.println("\"" + string1 + "\" equals \"" + string2 + "\"? " + compare);
    }
}
