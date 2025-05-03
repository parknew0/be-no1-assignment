package com.example.calculator.level3;

public enum OperatorType {
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/');

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromChar(char c) {
        for (OperatorType op : values()) {
            if (op.symbol == c) return op;
        }
        throw new IllegalArgumentException("지원하지않는 연산자입니다: " + c);
    }

}
