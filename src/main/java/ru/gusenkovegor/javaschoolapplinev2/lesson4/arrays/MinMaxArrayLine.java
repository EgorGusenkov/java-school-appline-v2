package ru.gusenkovegor.javaschoolapplinev2.lesson4.arrays;

import java.util.Arrays;
import java.util.Random;

public class MinMaxArrayLine {
    private static final int LENGTH_ARRAY = 20;
    private static final int MIN_RANDOM = -10;
    private static final int MAX_RANDOM = 10;

    public static void start() {
        Random random = new Random();
        int[] array = new int[LENGTH_ARRAY];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int minIndex = ArrayFunc.findMinIndex(array);
        int maxIndex = ArrayFunc.findMaxIndex(array);

        int min = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = min;

        System.out.println("Итоговый массив: " + Arrays.toString(array));
    }
}
