package com.ansar;

import java.util.Scanner;

/**
 * A=wl
 * input lenght and width
 * area = w * l
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        double area = 0.0;
        System.out.println("Enter Length and Width of a Rectangle");
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double l = scanner.nextDouble();

        area = w * l;
        System.out.printf("Area of Rectangle which has Width as %.2f and Length as %.2f is %.2f", w, l, area);
    }
}
