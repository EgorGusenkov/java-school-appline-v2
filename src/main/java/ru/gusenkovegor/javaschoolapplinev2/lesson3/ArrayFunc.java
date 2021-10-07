package ru.gusenkovegor.javaschoolapplinev2.lesson3;

public class ArrayFunc {

    public static String FindMaxLength(String[] array) {
        String max = "";
        for (String word : array) {
            if (word.length() > max.length())
                max = word;
        }
        return max;
    }
}
