package com.ansar;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 2312, temp = 0, tempNum = num;
        while (tempNum != 0) {
            int rem = tempNum % 10;
            temp = temp * 10 + rem;
            tempNum /= 10;
        }
        if (num == temp) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is Not a Palindrome");

        }
    }
}
