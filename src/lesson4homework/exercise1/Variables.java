package lesson4homework.exercise1;

public class Variables {
    public static void main(String[] args) {
        long currentWorldPopulation = 7811080815L;
        int carsProducedThisYear = 55235358;
        char firstLetterInAlphabet = 'A';
        boolean javaIsAmazing = true;
        final float PI = 3.14159f;

        displayVariable("Current World Population", currentWorldPopulation);
        displayVariable("Cars Produced This Year", carsProducedThisYear);
        displayVariable("First Letter In Alphabet", firstLetterInAlphabet);
        displayVariable("Java Is Amazing", javaIsAmazing);
        displayVariable("PI", PI);

    }

    static void displayVariable(String text, Object variable){
        System.out.println(text + ": " + variable);
    }
}
