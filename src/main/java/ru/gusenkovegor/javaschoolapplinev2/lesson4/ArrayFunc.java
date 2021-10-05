package ru.gusenkovegor.javaschoolapplinev2.lesson4;

public class ArrayFunc {

    public static int findMinIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex - 1;
    }

    public static int findMaxIndex(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex - 1;
    }
}
