package com.ansar;

/**
 * a positive integer that is equal to the sum of its proper divisors.
 * The smallest perfect number is 6, which is the sum of 1, 2, and 3
 * <p>
 * input num
 * init sum = 0
 * for i = 1 to i <= num/2
 * if num % i == 0 then sum = sum + i
 * end loop
 * if num == sum then perfect number else not
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int num = 4096, sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
