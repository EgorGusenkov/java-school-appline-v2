package ru.gusenkovegor.javaschoolapplinev2.lesson5;

import ru.gusenkovegor.javaschoolapplinev2.lesson2.Calculator;
import ru.gusenkovegor.javaschoolapplinev2.lesson2.InOutFunc;

import java.util.Scanner;

public class CalculatorOOP extends Calculator {
    private static final String ENTER_DOUBLE = "Введите число:";
    private static final String ENTER_OPERATION = "Введите операцию:";
    private static final String RESULT_OPERATION = "Результат операции: ";
    private static final String ERROR_READ_OPERATION = "Ошибка при считывании операции. Попробуйте еще раз.";
    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        int num1 = InOutFunc.readInt(scanner, ENTER_DOUBLE);
        int num2 = InOutFunc.readInt(scanner, ENTER_DOUBLE);
        char operation = readOperation();
        double result = calc(num1, num2, operation);
        System.out.println(RESULT_OPERATION + result);
    }

    public static char readOperation() {
        System.out.println(ENTER_OPERATION);
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.err.println(ERROR_READ_OPERATION);
            scanner.next();
            operation = readOperation();
        }
        return operation;
    }

    public static double calc(double a, double b, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = subtract(a, b);
                break;
            case '*':
                result = multiply(a, b);
                break;
            case '/':
                result = divide(a, b);
                break;
            default:
                System.err.println(ERROR_READ_OPERATION);
                result = calc(a, b, readOperation());
        }
        return result;
    }
}
