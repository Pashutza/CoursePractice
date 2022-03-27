package lesson18homework.exercise3;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void simulateDictionary() {
        Map<String, String> map = new HashMap<>();
        map.put("Brown", "Maro");
        map.put("Purple", "Mov");
        map.put("Red", "Rosu");
        map.put("Yellow", "Galben");
        map.put("White", "Alb");
        map.put("Black", "Negru");
        map.put("Pink", "Roz");
        map.put("Green", "Verde");
        map.put("Gray", "Gri");
        map.put("Orange", "Portocaliu");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
