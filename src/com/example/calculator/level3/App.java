package com.example.calculator.level3;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException {
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while(!(input = br.readLine()).equals("exit")) {
            input = input.replaceAll(" ", "");
            char operator = 0;

            if (input.contains("+")) operator = '+';
            else if (input.contains("-")) operator = '-';
            else if (input.contains("*")) operator = '*';
            else if (input.contains("/")) operator = '/';

            String[] numbers = input.split(Pattern.quote(String.valueOf(operator)));
            double a = Double.parseDouble(numbers[0]);
            double b = Double.parseDouble(numbers[1]);
            OperatorType opType = OperatorType.fromChar(operator);
            double result = calculator.calculate(a, b, opType);

            System.out.println(result);
        }

        System.out.println("100 이상인 결과들:");
        calculator.getResults().stream()
                .filter(r -> r >= 100)
                .forEach(System.out::println);
    }
}
