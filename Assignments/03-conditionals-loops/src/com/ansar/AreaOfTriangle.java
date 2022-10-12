package com.ansar;

import java.util.Scanner;

/**
 * area = 0.5 * b * h (or) 1/2 * b * h
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        double area = 0.0;
        System.out.println("Enter base and height of a triangle");
        Scanner scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();

        area = 0.5 * b * h;
        System.out.printf("Area of triangle which has base as %.2f and Height as %.2f is %.2f", b, h, area);
    }
}
