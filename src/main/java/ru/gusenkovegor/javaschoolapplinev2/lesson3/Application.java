package ru.gusenkovegor.javaschoolapplinev2.lesson3;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.CalculatorLine;
import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        do {
            switch (getCalculatorAction(scanner)) {
                case 1:
                    CalculatorLine.startCalculator();
                    break;
                case 2:
                    ArrayLine.startArrayFunc();
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
    }

    public static int getCalculatorAction(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - Калькулятор \n" +
                        "2 - поиск максимального слова в массиве \n" +
                        "0 - Закончить работу",
                2);
    }
}
