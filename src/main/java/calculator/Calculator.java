package calculator;

/**
 * Calculator" class, to declare all "setters", "getters" that we will
 * use in the project, as well as to define the "math" function and
 * perform the mathematical operations..
 *
 * @author: Kbiters
 * @version: 19/04/2021
 * @see:
 **/
public class Calculator implements ICalulator {

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operator;

    /**
     * The "math" method receives the parameters and based on the operator,
     * we make a mapping to see which of the 4 mathematical operations will
     * be performed, once it is detected which one will be used, the
     * corresponding function will be called, the "firstNumber" and
     * "secondNumber" will be passed to perform the operation and its
     * result will be set by "setResult".
     *
     * @param firstNumber
     * @param secondNumber
     * @param operator
     */
    public void math(double firstNumber, double secondNumber, String operator) {

        switch (Operator.getOperator(operator)) {
            case SUM:
                this.setResult(sum(firstNumber, secondNumber));
                break;
            case SUBTRACT:
                this.setResult(sub(firstNumber, secondNumber));
                break;
            case MULTIPLY:
                this.setResult(multiply(firstNumber, secondNumber));
                break;
            case DIVIDE:
                this.setResult(divide(firstNumber, secondNumber));
                break;
            default:
                throw new ArithmeticException("Invalid Operator");
        }
    }

    /**
     * Method to obtain the first number and return it
     *
     * @return
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Method to enter the first number in the variable.
     *
     * @param firstNumber
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Method to obtain the second number and return it
     *
     * @return
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Method to enter the second number to the variable.
     *
     * @param secondNumber
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Method to obtain the operator and return it.
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Method to enter the operator to the variable.
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * Method to obtain the result and return it.
     *
     * @return
     */
    public double getResult() {
        return result;
    }

    /**
     * Method to enter the result to the variable.
     *
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * Method that receives the 2 parameters and performs the operation: "sum"
     * and returns the result.
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    @Override
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Method that receives the 2 parameters and performs the operation: "subtract"
     * and returns the result.
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    @Override
    public double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Method that receives the 2 parameters and performs the operation: "multiply"
     * and returns the result.
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Method that receives the 2 parameters and performs the operation: "divide"
     * and returns the result.
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}