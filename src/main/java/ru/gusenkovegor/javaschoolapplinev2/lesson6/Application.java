package ru.gusenkovegor.javaschoolapplinev2.lesson6;

import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/words.txt";
        List<String> stringArrayList = FileFunc.readToArrayListStrings(path);
        Collections.sort(stringArrayList);
        HashMap<String, Integer> map = CollectionFunc.countNumWords(stringArrayList);
        String max = CollectionFunc.findMaxCountNumWords(map);
        System.out.println(stringArrayList);
        System.out.println(map);
        System.out.println("слово с максимальным количеством повторений: "+max + "=" + map.get(max));
    }
}
