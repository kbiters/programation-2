package calculator;

import java.util.Scanner;

/**
 * Class defined to execute the program instructions.
 *
 * @author: Kbiters
 * @version: 18/04/2021
 **/
public class Menu {

    public void run() {
        Scanner reader = new Scanner(System.in);
        this.showInputNumber();
        double firstNumber = reader.nextDouble();
        this.showInputNumber();
        double secondNumber = reader.nextDouble();
        this.showInputOperator();
        String operator = reader.next();
        Calculator calc = new Calculator();
        double result = calc.math(firstNumber, secondNumber, operator);
        this.showResult(firstNumber, secondNumber, operator, result);
    }

    /**
     * Function to print on screen the constant "INPUT_NUMBER".
     */
    public void showInputNumber() {
        Printer.print(Constant.INPUT_NUMBER);

    }

    /**
     * Function to print on screen the constant "INPUT_OPERATOR".
     */
    public void showInputOperator() {
        Printer.print(Constant.INPUT_OPERATOR);
    }

    /**
     * Function to print on the screen the constant "RESULT", as well as the numbers
     * to work with, the operator to use and the result of that operation.
     *
     * @param firstNumber
     * @param secondNumber
     * @param Operator
     * @param result
     */
    public void showResult(double firstNumber, double secondNumber,
                           String Operator, double result) {
        Printer.print(Constant.RESULT, firstNumber, Operator, secondNumber, "=", result);
    }

}
