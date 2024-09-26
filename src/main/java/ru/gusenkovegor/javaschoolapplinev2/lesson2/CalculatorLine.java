package ru.gusenkovegor.javaschoolapplinev2.lesson2;

import java.util.Scanner;

public class CalculatorLine {
    private static final String ENTER_DOUBLE = "Введите число";

    public static int getCalculatorAction(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - сложить \n" +
                        "2 - вычесть\n" +
                        "3 - умножить\n" +
                        "4 - разделить\n" +
                        "0 - Закончить работу",
                4);
    }

    public static void start(Scanner scanner) {
        boolean isContinue = true;
        do {
            switch (getCalculatorAction(scanner)) {
                case 1:
                    System.out.printf("Результат сложения: %.4f %n",
                            Calculator.add(
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE),
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE)));
                    break;
                case 2:
                    System.out.printf("Результат вычитания: %.4f %n",
                            Calculator.subtract(
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE),
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE)));
                    break;
                case 3:
                    System.out.printf("Результат умножения: %.4f %n",
                            Calculator.multiply(
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE),
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE)));
                    break;
                case 4:
                    System.out.printf("Результат деления: %.4f %n",
                            Calculator.divide(
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE),
                                    InOutFunc.readDouble(scanner, ENTER_DOUBLE)));
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
    }
}
