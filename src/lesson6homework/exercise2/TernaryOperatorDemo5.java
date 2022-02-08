package lesson6homework.exercise2;

public class TernaryOperatorDemo5 {
    public static void main(String[] args){
        int colorCode = 101;
        System.out.println("Color is " + getColor(colorCode));
    }

    private static String getColor(int colorCode) {
        return colorCode == 100 ? "Yellow" : colorCode == 101 ? "Green" : colorCode == 102 ? "Red" : "Invalid";
    }
}
