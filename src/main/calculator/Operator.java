package calculator;

import java.util.HashMap;

public enum Operator {
    SUM("+"),
    SUBTRACT("+"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String value;

    private static final Map<String, Operator> operatorMap = new HashMap<String, Operator>();

    static {
        for (Operator op : Operator.values()) {
            operatorMap.put(op.getValue(), op);
        }
    }

    private Operator(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Operator get(String value) {
        return operatorMap.get(value);
    }

}