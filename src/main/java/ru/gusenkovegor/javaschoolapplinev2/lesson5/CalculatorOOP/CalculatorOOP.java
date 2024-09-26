package ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP;

public class CalculatorOOP {
    private static final String ERROR_READ_OPERATION = "Неизвестная операция";
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private double result;
    private final char[] operationArray = {'+', '-', '*', '/'};

    public CalculatorOOP() {
    }

    public CalculatorOOP(double firstNumber, double secondNumber, char operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public char getArifSymbol() {
        return operation;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calc() {
        switch (operation) {
            case '+':
                result = add();
                break;
            case '-':
                result = subtract();
                break;
            case '*':
                result = multiply();
                break;
            case '/':
                result = divide();
                break;
            default:
                throw new IllegalArgumentException(ERROR_READ_OPERATION);
        }
        return result;
    }

    private double add() {
        return firstNumber + secondNumber;
    }

    private double subtract() {
        return firstNumber - secondNumber;
    }

    private double multiply() {
        return firstNumber * secondNumber;
    }

    private double divide() throws ArithmeticException {
        double result = 0;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        if (secondNumber == 0) {
            throw new ArithmeticException("You cannot divide by zero");
        }
        return result;
    }
}
