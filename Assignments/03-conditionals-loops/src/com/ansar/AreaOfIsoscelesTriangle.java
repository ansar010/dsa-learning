package com.ansar;

import java.util.Scanner;

/**
 * Program To Check whether a Triangle is Equilateral, Isosceles or Scalene.
 * Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal. X = Y = Z.
 * <p>
 * Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal.
 * the triangle is isosceles if either X = Y or X = Z or Y = Z.
 * <p>
 * Scalene Triangle: A triangle is said Scalene Triangle if none of its sides is equal.
 */
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Enter three side value of traingle: X Y Z");
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();

        checkTriangle(x, y, z);
    }

    private static void checkTriangle(float x, float y, float z) {
        if (x == y && y == z) {
            System.out.println("Equilateral Triangle");
        } else if (x == y || x == z || y == z) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
