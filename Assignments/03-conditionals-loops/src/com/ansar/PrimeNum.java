package com.ansar;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if (num <= 1) {
            System.out.println("neither prime or composite");
        }
        //using i*i we can reduce number of loops
        for (int i = 2; i * i <= num; i++) {
            if (i % num == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is Not a Prime number");
        }
    }
}
