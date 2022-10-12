package com.ansar;

import java.util.Scanner;

/**
 * input length of fib series
 * init nextNum = 0 firstNum = 0 secondNum = 1 and print f and s
 * for  i = 2 to i < length i ++
 * nextNum = firstNum + secondNum
 * print nextNum
 * firstNum = secondNum
 * secondNum = nextNum
 * end loop
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1, nextNum = 0;
        System.out.println("Enter the length of Fibonacci series");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.print(firstNum + " " + secondNum);
        for (int i = 2; i < length; i++) {
            nextNum = firstNum + secondNum;
            System.out.print(" " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
