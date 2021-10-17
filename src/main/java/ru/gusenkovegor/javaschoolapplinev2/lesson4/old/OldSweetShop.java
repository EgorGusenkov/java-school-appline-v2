package ru.gusenkovegor.javaschoolapplinev2.lesson4.old;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OldSweetShop {

    public static int getSweet(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - WHITE_CHOCOLATE \n" +
                        "2 - MILK_CHOCOLATE \n" +
                        "3 - CANDY \n" +
                        "4 - JELLYBEAN \n" +
                        "0 - Закончить работу",
                4);
    }

    public static void start() {
        boolean isContinue = true;
        Set<OldSweets> basket = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            switch (getSweet(scanner)) {
                case 1:
                    basket.add(OldSweets.WHITE_CHOCOLATE);
                    break;
                case 2:
                    basket.add(OldSweets.MILK_CHOCOLATE);
                    break;
                case 3:
                    basket.add(OldSweets.CANDY);
                    break;
                case 4:
                    basket.add(OldSweets.JELLYBEAN);
                    break;
                case 0:
                    isContinue = false;
                    break;
            }
            System.out.println("Сумма корзины :" + getSum(basket) + " руб.");
            System.out.println("Вес корзины: " + getBasketWeight(basket) + " гр.");
            System.out.println("Информация о товарах в корзине:\n" + getInfo(basket));
        } while (isContinue);
    }

    private static double getSum(Set<OldSweets> basket) {
        double sum = 0;
        for (OldSweets sweet : basket) {
            sum += sweet.getPrice();
        }
        return sum;
    }

    private static double getBasketWeight(Set<OldSweets> basket) {
        double basketWeigh = 0;
        for (OldSweets sweet : basket) {
            basketWeigh += sweet.getWeight();
        }
        return basketWeigh;
    }

    private static String getInfo(Set<OldSweets> basket) {
        StringBuilder info = new StringBuilder();
        for (OldSweets sweet : basket) {
            info.append(sweet.toString());
        }
        return info.toString();
    }
}
