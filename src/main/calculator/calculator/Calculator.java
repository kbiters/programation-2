package calculator;

import java.util.Scanner;

public class Calculator implements ICalulator {

    private double num1, num2;
    private String operator;

    public double math(double num1, double num2, String operator) {

        switch (Operator.getOperator(operator)) {
        case SUM:
            return sum(num1, num2);
        case SUBTRACT:
            return sub(num1, num2);
        case MULTIPLY:
            return multiply(num1, num2);
        case DIVIDE:
            return divition(num1, num2);
        default:
            System.out.println("Illigal Operation");
        }
        return 0;
    }

    public void setFirstNumber(double num1) {
        this.num1 = num1;
    }

    public void setSecondNumber(double num2) {
        this.num2 = num2;
    }

    public Double getFirstNumber() {
        return num1;
    }

    public Double getSecondNumber() {
        return num2;
    }

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;

    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;

    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;

    }

    @Override
    public double divition(double num1, double num2) {
        return num1 / num2;

    }

}