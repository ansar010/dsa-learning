package com.ansar;

public class Factorial {
    public static void main(String[] args) {
        int number = 1, result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
