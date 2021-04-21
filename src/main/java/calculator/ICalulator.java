package calculator;

/**
 * Interface "ICalculator", is a collection of abstract methods
 * and constant properties. The interface can be used by any
 * other code.
 *
 * @author: Kbiters
 * @version: 19/04/2021
 * @see: https://github.com/kbiters/programation-2/blob/main/src/main/java/calculator/ICalulator.java
 */
public interface ICalulator {

    double sum(double firstNumber, double secondNumber);

    double sub(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);
}
