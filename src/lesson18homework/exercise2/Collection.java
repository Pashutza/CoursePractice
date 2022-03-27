package lesson18homework.exercise2;

import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static void showCollectionOfUnicValue(String list[]) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        System.out.println(set);
    }
}

