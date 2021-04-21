package calculator;

/**
 *
 */
public class Calculator implements ICalulator {

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operator;

    /**
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
     *
     * @return
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     *
     * @param firstNumber
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     *
     * @return
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     *
     * @param secondNumber
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     *
     * @return
     */
    public double getResult() {
        return result;
    }

    /**
     *
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
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