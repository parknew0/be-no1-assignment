package com.example.calculator.level2;

import java.util.*;

public class CalculatorLV2 {
    private List<Integer> results = new ArrayList<>();

    public int calculate (int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                return 0;
        }

        results.add(result);
        return result;
    }

    public List<Integer> getResults () {
        return results;
    }

    public void setResults (List<Integer> newResults) {
        this.results = newResults;
    }

    public void removeResult() {
        List<Integer> myList = this.results;
        if (!myList.isEmpty()) myList.remove(0);
    }
}
