package com.ansar.assignment;

import java.util.Scanner;

/**
 * To calculate Fibonacci Series up to n numbers.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int firstnumber = 0, secondNumber = 1, nextNumber, length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter nth number for Fibonacci series");
        length = scanner.nextInt();

        System.out.print(firstnumber + " " + secondNumber);
        for (int i = 3; i <= length; i++) {
            nextNumber = firstnumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstnumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
