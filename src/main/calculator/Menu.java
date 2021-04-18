package calculator;

/**
 * Class defined to execute the program instructions.
 *
 * @author: Kbiters
 * @version: 18/04/2021
 **/
public class Menu {

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
