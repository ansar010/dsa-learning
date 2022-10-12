package com.ansar;

import java.util.Scanner;

/**
 * average = sum of number / count of number
 */
public class Calculate_Avg_0f_N {
    public static void main(String[] args) {
        int n = 5, count = 1, sum = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        while (count <= n) {
            System.out.printf("Enter the %d number\n", count);
            sum += sc.nextInt();
            ++count;
        }
        avg = sum / n;
        System.out.println(avg);
    }
}
