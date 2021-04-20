package calculator;

import java.util.Scanner;

public class Calculator implements ICalulator {

    private double num1, num2;
    private String operator;

    public double math(double firstNumber, double secondNumber, String operator) {

        switch (Operator.getOperator(operator)) {
            case SUM:
                return sum(firstNumber, secondNumber);
            case SUBTRACT:
                return sub(firstNumber, secondNumber);
            case MULTIPLY:
                return multiply(firstNumber, secondNumber);
            case DIVIDE:
                return divition(firstNumber, secondNumber);
            default:
                System.out.println("Illigal Operation");
        }
        return 0;
    }

    public void setFirstNumber(double firstNumber) {
        this.num1 = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.num2 = secondNumber;
    }

    public Double getFirstNumber() {
        return num1;
    }

    public Double getSecondNumber() {
        return num2;
    }

    @Override
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;

    }

    @Override
    public double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;

    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;

    }

    @Override
    public double divition(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;

    }

}