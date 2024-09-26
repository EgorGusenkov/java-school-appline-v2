package ru.gusenkovegor.javaschoolapplinev2.lesson4.sweets;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SweetShop {

    private static int getSweet(Scanner scanner) {
        return InOutFunc.readAction(scanner,
                "1 - WHITE_CHOCOLATE \n" +
                        "2 - MILK_CHOCOLATE \n" +
                        "3 - CANDY \n" +
                        "4 - JELLYBEAN \n" +
                        "0 - Закончить работу",
                4);
    }

    public static void start(Scanner scanner) {
        boolean isContinue = true;
        Set<Sweets> basket = new HashSet<>();
        do {
            switch (getSweet(scanner)) {
                case 1:
                    WhiteChocolate whiteChocolate = new WhiteChocolate(50, 50);
                    whiteChocolate.setCalorie(145);
                    basket.add(whiteChocolate);
                    break;
                case 2:
                    MilkChocolate milkChocolate = new MilkChocolate(55, 55);
                    milkChocolate.setPercentageOfCocoa(30);
                    basket.add(milkChocolate);
                    break;
                case 3:
                    Candy candy = new Candy(60, 60);
                    candy.setCountryOfOrigin("Россия");
                    basket.add(candy);
                    break;
                case 4:
                    Jellybean jellybean = new Jellybean(65, 65);
                    jellybean.setComposition("сахар, глюкозный сироп, кукурузный крахмал");
                    basket.add(jellybean);
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
            info.append(sweet).append("\n");
        }
        return info.toString();
    }
}
