package com.example.calculator.level3;

import java.util.*;

public class ArithmeticCalculator<T extends Number> {
    private final List<Double> results = new ArrayList<>();

    public double calculate(T num1, T num2, OperatorType operator) {
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result = 0;

        switch (operator) {
            case ADD -> result = a + b;
            case SUB -> result = a - b;
            case MUL -> result = a * b;
            case DIV -> {
                if (b == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = a / b;
            }
        }

        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
