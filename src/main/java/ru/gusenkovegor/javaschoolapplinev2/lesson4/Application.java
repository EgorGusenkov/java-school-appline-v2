package ru.gusenkovegor.javaschoolapplinev2.lesson4;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        boolean isContinue = true;
        Scanner scanner = new Scanner(System.in);
        do {
            switch (getAction(scanner)) {
                case 1:
                    MinMaxArrayLine.startMinMaxArray();
                    break;
                case 2:
                    SweetShop.start();
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
        } while (isContinue);
    }

    public static int getAction(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - Замена минимального и максимальногоо значения в массиве \n" +
                        "2 - Магазин сладостей \n" +
                        "0 - Закончить работу",
                2);
    }
}
