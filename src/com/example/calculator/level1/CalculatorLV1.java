package com.example.calculator.level1;

import java.io.*;

public class CalculatorLV1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while(!(input = br.readLine()).equals("exit")) {
            int a = input.charAt(0) - '0';
            char operator = input.charAt(1);
            int b = input.charAt(2) - '0';
            int result = 0;

            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        result = -1;
                        break;
                    }
                    result = a / b;
                    break;
            }

            if (result == -1) {
                System.out.println("0으로 나눌 수는 없습니다.");
            }
            else{
                System.out.println(result);
            }
        }

    }
}
