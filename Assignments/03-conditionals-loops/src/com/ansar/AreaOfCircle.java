package com.ansar;

import java.util.Scanner;

/**
 * input circle radius
 * A=πr2 where pi value 22/7 (or) 3.14
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        double area = 0.0;
        System.out.println("Enter circle radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        area = 3.14 * Math.pow(radius, 2);
        System.out.printf("Area of circle for radius %.2f is %.2f", radius, area);
    }
}
