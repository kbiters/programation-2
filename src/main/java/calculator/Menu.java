package calculator;

import java.util.Scanner;

/**
 * Class defined to execute the program instructions.
 *
 * @author: Kbiters
 * @version: 18/04/2021
 * @see: https://github.com/kbiters/programation-2/blob/main/src/main/java/calculator/Menu.java
 **/
public class Menu {

    /**
     * In this "run" function, the methods that will show the "enter a number"
     * and "Enter the operator" message are called, as well as the 3 methods
     * to enter the 2 numbers and the operator to be used.
     * Then we call the function "math" passing it as parameters, the first
     * number, the second number and the chosen operator.
     * <p>
     * Finally, we call the "showResult" method, which will display the message
     * with the operation performed and then the result, that is why we pass
     * as parameters: "getFirstNumber()", "getSecondNumber()", "getOperator()"
     * and "getResult()".
     */
    public void run() {

        Scanner reader = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            this.showInputNumber();
            calc.setFirstNumber(reader.nextDouble());
            this.showInputNumber();
            calc.setSecondNumber(reader.nextDouble());
            this.showInputOperator();
            calc.setOperator(reader.next());

        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

        calc.math(calc.getFirstNumber(), calc.getSecondNumber(), calc.getOperator());

        this.showResult(calc.getFirstNumber(), calc.getSecondNumber(),
                calc.getOperator(), calc.getResult());
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
    public void showResult(double firstNumber, double secondNumber, String Operator, double result) {
        Printer.print(Constant.RESULT, firstNumber, Operator, secondNumber, "=", result);
    }

}
