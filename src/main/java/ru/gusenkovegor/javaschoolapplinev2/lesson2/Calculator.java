package ru.gusenkovegor.javaschoolapplinev2.lesson2;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        double result = 0;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        if (b == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        }
        return result;
    }
}
