package com.ansar;

import java.util.Scanner;

/**
 * Take integer inputs till the user enters 0 and print the largest number from
 */
public class PrintLargestNumber {
    public static void main(String[] args) {
        int largestNumber = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("input number");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else if (input > largestNumber) {
                largestNumber = input;
            }
        }
        System.out.println(largestNumber + " is largest number");
    }
}
