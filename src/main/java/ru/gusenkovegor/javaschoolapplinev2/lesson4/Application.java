package ru.gusenkovegor.javaschoolapplinev2.lesson4;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;
import ru.gusenkovegor.javaschoolapplinev2.lesson4.arrays.MinMaxArrayLine;
import ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets.SweetShop;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        do {
            switch (getAction(scanner)) {
                case 1:
                    MinMaxArrayLine.start();
                    break;
                case 2:
                    SweetShop.start(scanner);
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
        scanner.close();
    }

    public static int getAction(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - Замена минимального и максимальногоо значения в массиве \n" +
                        "2 - Магазин сладостей \n" +
                        "0 - Закончить работу",
                2);
    }
}
