package ru.gusenkovegor.javaschoolapplinev2.lesson4;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArrayLine {

    public static void startMinMaxArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[InOutFunc.readInt(scanner, "Введите длинну массива >= 2:")];
        System.out.println("Введите значения массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
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
