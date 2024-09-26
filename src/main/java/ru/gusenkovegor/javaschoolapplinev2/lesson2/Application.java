package ru.gusenkovegor.javaschoolapplinev2.lesson2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorLine.start(scanner);
        scanner.close();
    }
}
