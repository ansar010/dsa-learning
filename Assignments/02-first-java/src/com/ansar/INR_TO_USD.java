package com.ansar.assignment;

import java.util.Scanner;

/**
 * Input currency in rupees and output in USD.
 */
public class INR_TO_USD {
    public static void main(String[] args) {
        double oneDollarToInr = 0.013;
        System.out.println("Enter Rupees to convert in dollar");
        Scanner scanner = new Scanner(System.in);
        double inr = scanner.nextDouble();
        double dollar = oneDollarToInr * inr;
        System.out.printf("INR %2f = $%2f", inr, dollar);
        scanner.close();
    }
}
