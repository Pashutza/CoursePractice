package lesson6homework.exercise1;

public class Porridge {
    int maxTemp = 60;
    int minTemp = 18;

    public String isGoodForEat(double temperature) {
        return temperature > maxTemp ? "Porridge is too hot." : temperature < minTemp ? "Porridge is too cold."
                : "Porridge is just right.";
    }
}
