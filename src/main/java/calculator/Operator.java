package calculator;

import java.util.HashMap;
import java.util.Map;


public enum Operator {
    SUM("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

    private static Map<String, Operator> operatorMap = new HashMap<String, Operator>();

    private final String value;

    static {
        for (Operator op : Operator.values()) {
            operatorMap.put(op.value, op);
        }
    }

    Operator(String value) {
        this.value = value;
    }

    public static Operator getOperator(String key) {
        return operatorMap.get(key);
    }

}