package com.ansar.assignment;

import java.util.Scanner;

/**
 * Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 * start -> Enter P, T, R -> S.I = (P * T * R) / 100 -> Print S.I -> stop
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double simpleInterest;

        System.out.println("Enter Principal Amount");
        double p = scanner.nextDouble();

        System.out.println("Enter Tenure/Time");
        double t = scanner.nextDouble();

        System.out.println("Enter Rate of Interest");
        double r = scanner.nextDouble();

        simpleInterest = (p * t * r) / 100;

        System.out.printf("Simple Interest is :%2f ", simpleInterest);
        scanner.close();
    }
}
