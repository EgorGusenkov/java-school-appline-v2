package ru.gusenkovegor.javaschoolapplinev2.lesson4;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SweetShop {

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
        Set<Sweets> basket = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        do {
            switch (getSweet(scanner)) {
                case 1:
                    basket.add(Sweets.WHITE_CHOCOLATE);
                    break;
                case 2:
                    basket.add(Sweets.MILK_CHOCOLATE);
                    break;
                case 3:
                    basket.add(Sweets.CANDY);
                    break;
                case 4:
                    basket.add(Sweets.JELLYBEAN);
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

    private static double getSum(Set<Sweets> basket) {
        double sum = 0;
        for (Sweets sweet : basket) {
            sum += sweet.getPrice();
        }
        return sum;
    }

    private static double getBasketWeight(Set<Sweets> basket) {
        double basketWeigh = 0;
        for (Sweets sweet : basket) {
            basketWeigh += sweet.getWeight();
        }
        return basketWeigh;
    }

    private static String getInfo(Set<Sweets> basket) {
        StringBuilder info = new StringBuilder();
        for (Sweets sweet : basket) {
            info.append(sweet.toString());
        }
        return info.toString();
    }
}
