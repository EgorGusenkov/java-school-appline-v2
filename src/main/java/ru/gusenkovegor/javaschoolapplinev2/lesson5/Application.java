package ru.gusenkovegor.javaschoolapplinev2.lesson5;

import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP.CalculatorOOP;

public class Application {
    public static void main(String[] args) {
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        calculatorOOP.setFirstNumber(23);
        calculatorOOP.setSecondNumber(32);
        calculatorOOP.setOperation('q');
        System.out.println(calculatorOOP.calc());

    }
}
