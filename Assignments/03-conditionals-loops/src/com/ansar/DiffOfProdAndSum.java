package com.ansar;

/**
 * Subtract the Product and Sum of Digits of an Integer.
 */
public class DiffOfProdAndSum {

    private static int diffProdSum(int n) {
        int p = 1, sum = 0;
        while (n != 0) {
            int rem = n % 10;
            p *= rem;
            sum += rem;
            n /= 10;
        }

        return p - sum;
    }

    public static void main(String args[]) {
        System.out.println(diffProdSum(111));
    }
}
