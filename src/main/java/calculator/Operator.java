package calculator;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum to perform the mapping and thus obtain from the enumeration,
 * the operator that is needed.
 *
 * @author: Kbiters
 * @version: 19/04/2021
 * @see: https://github.com/kbiters/programation-2/blob/main/src/main/java/calculator/Operator.java
 */
public enum Operator {
    SUM("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

    private static final Map<String, Operator> operatorMap = new HashMap<String, Operator>();

    private final String value;

    static {
        for (Operator op : Operator.values()) {
            operatorMap.put(op.value, op);
        }
    }

    /**
     * Function in charge of receiving the operator and storing it
     * in the variable.
     *
     * @param value
     */
    Operator(String value) {
        this.value = value;
    }

    /**
     * Function in charge of receiving the operator to be used and by
     * means of mapping brings the operation to be performed and
     * returns it.
     *
     * @param operator
     * @return
     */
    public static Operator getOperator(String operator) {
        return operatorMap.get(operator);
    }

}