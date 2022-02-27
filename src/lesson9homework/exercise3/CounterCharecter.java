package lesson9homework.exercise3;

public class CounterCharecter {

    public static int counterCharacter(String word, char character) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                counter++;
            }
        }
        return counter;

    }
}
