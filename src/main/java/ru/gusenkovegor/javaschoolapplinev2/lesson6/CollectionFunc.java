package ru.gusenkovegor.javaschoolapplinev2.lesson6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFunc {

    public static HashMap<String, Integer> countNumWords(List<String> stringSet) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : stringSet) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }
        return hashMap;
    }

    public static String findMaxCountNumWords(Map<String, Integer> map) {
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }
}
