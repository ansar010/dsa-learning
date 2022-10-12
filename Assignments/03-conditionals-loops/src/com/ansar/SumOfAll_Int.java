package com.ansar;

import java.util.Scanner;

/**
 * Take integer inputs till the user enters 0 and print the sum of all numbers
 */
public class SumOfAll_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter number or enter x to exit.");
            char input = sc.next().trim().charAt(0);
            if (input == 'x' || input == 'X') {
                break;
            } else {
                sum = sum + Character.getNumericValue(input);
            }
        }
        System.out.println(sum);
    }
}
