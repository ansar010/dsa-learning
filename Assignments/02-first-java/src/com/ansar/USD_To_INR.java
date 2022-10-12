package com.ansar.assignment;

import java.util.Scanner;

public class USD_To_INR {
    public static void main(String[] args) {
        double oneInrToDollar = 79.68;
        System.out.println("Enter Dollar to convert in Rupees");
        Scanner scanner = new Scanner(System.in);
        double dlr = scanner.nextDouble();
        double inr = oneInrToDollar * dlr;
        System.out.printf("$%2f = INR %2f", dlr, inr);
        scanner.close();
    }
}
