package com.example.calculator.level2;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CalculatorLV2 calculator = new CalculatorLV2();
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
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            int result = calculator.calculate(a, b, operator);

            System.out.println(result);
            System.out.println("예: 1+1 처럼 연산식 전체를 한 줄로 입력하세요. (종료하려면 'exit' 입력)");
        }

        calculator.removeResult(); // 제일 첫 결과를 결과 리스트에서 제거한다.
        System.out.println(calculator.getResults());
    }
}
