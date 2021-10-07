package ru.gusenkovegor.javaschoolapplinev2.lesson2;

import java.util.Scanner;

public class InOutFunc {
    private static final String WAIT_DOUBLE = "Ожидается вввод числа";
    private static final String WAIT_INT = "Ожидается вввод цифры";

    static double readDouble(Scanner scanner, String text) {
        double result = 0;
        System.out.println(text);
        try {
            String value = scanner.nextLine();
            result = Double.parseDouble(value);
        } catch (Exception e) {
            System.err.println(WAIT_DOUBLE);
        }
        return result;
    }

    public static int readInt(Scanner scanner, String text) {
        int result = 0;
        System.out.println(text);
        try {
            String value = scanner.nextLine();
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String readString(Scanner sc, String text) {
        String string;
        do {
            System.out.println(text);
            string = sc.nextLine();
        } while (string.isEmpty());
        return string;
    }

    public static int readAction(Scanner scanner, String text, int max) {
        int result = 0;
        boolean isContinue;
        do {
            System.out.println(text);
            try {
                String value = scanner.nextLine();
                result = Integer.parseInt(value);
            } catch (Exception e) {
                System.err.println(WAIT_INT);
                continue;
            }
            isContinue = result < -1 || result > max;
            if (isContinue) {
                System.err.println("Не удовлетворяет заданному диапазону: минимум - 0, максимум - " + max);
            }
        } while (result < 0 || result > max);
        return result;
    }
}
