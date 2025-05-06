package com.example.calculator.level3;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException {
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("예: 1+1 처럼 연산식 전체를 한 줄로 입력하세요. (종료하려면 'exit' 입력)");

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
            System.out.println("예: 1+1 처럼 연산식 전체를 한 줄로 입력하세요. (종료하려면 'exit' 입력)");
        }

        System.out.println("현재 입력값보다 큰 결과값들을 출력합니다");
        System.out.print("입력 : ");
        double num = Double.parseDouble(br.readLine());
        calculator.printResultsOver(num);
    }
}
