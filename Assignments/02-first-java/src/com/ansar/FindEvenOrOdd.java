package com.ansar.assignment;

import java.util.Scanner;

/**
 * Write a program to print whether a number is even or odd, also take input from the user.
 * start
 * input num
 * if num % 2 == 0 then even else odd
 * stop
 */
public class FindEvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter number to check Odd or Even");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even number.");
        } else {
            System.out.println(num + " is Odd Number.");
        }
    }
}
