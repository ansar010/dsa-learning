package com.ansar.assignment;

import java.util.Scanner;

/**
 * Take 2 numbers as input and print the largest number.
 */
public class LargeNumber {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2)
            System.out.println("large number is : " + num1);
        else
            System.out.println("large number is : " + num2);
    }
}
