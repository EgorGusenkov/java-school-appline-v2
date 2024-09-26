package ru.gusenkovegor.javaschoolapplinev2.lesson3;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.Scanner;

public class ArrayLine {
    private static final String ENTER_ARRAY_WORDS = "Введите массив слов через пробел";

    public static void startArrayFunc() {
        Scanner scanner = new Scanner(System.in);
        String array = InOutFunc.readString(scanner, ENTER_ARRAY_WORDS);
        System.out.println("Самое длинное слово: " + ArrayFunc.FindMaxLength(array.split(" ")));
        scanner.close();
    }
}
