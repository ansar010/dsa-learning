package com.ansar;

import java.util.Scanner;

/**
 * while infinite
 * input operator and two number num1 num2
 * initialise result = 0
 * if operator '+' or '-' or '*' or '/' or '%'
 * if operator = '+' then result = num1 + num2
 * if operator = '-' then result = num1 - num2
 * if operator = '*' then result = num1 * num2
 * if num1 != 0 and num2 != 0
 * if operator = '/' then result = num1 / num2
 * if operator = '%' then result = num1 % num2
 * else if operator = 'x' then break
 * else print "invalid operation"
 * print result
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter operator");
            char operator = sc.next().trim().charAt(0);


            if (operator == '+' || operator == '-' || operator == '*'
                    || operator == '/' || operator == '%') {

                System.out.println("Enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (operator == '+') {
                    result = num1 + num2;
                }
                if (operator == '-') {
                    result = num1 - num2;
                }
                if (operator == '*') {
                    result = num1 * num2;
                }
                if (num1 != 0 && num2 != 0) {
                    if (operator == '/') {
                        result = num1 / num2;
                    }
                    if (operator == '%') {
                        result = num1 % num2;
                    }
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.printf("result:%d\n", result);
        }
    }
}
