package calculator;

public class Calculator implements ICalulator {

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operator;

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

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
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
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}