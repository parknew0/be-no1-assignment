package com.example.calculator.level1;

import java.util.Scanner;

public class CalculatorLV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (!(input = scanner.next()).equals("exit")) {
            int a = input.charAt(0) - '0';
            char operator = input.charAt(1);
            int b = input.charAt(2) - '0';
            int result = 0;

            switch (operator) {
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> {
                    if (b == 0) {
                        result = -1;
                        break;
                    }
                    result = a / b;
                }
            }

            if (result == -1) {
                System.out.println("0으로 나눌 수는 없습니다.");
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }
}
