package calculator;

import java.util.Scanner;

public class Calculator implements ICalulator {

    private double firstNumber, secondNumber;
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
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
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