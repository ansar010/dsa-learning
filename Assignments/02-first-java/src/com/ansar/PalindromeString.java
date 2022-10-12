package com.ansar.assignment;

import java.util.Scanner;

/**
 * To find out whether the given String is Palindrome or not
 */
public class PalindromeString {
    public static void main(String[] args) {
        String reverseWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word to check palindrome or not!");
        String word = scanner.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        if(word.equalsIgnoreCase(reverseWord)) {
            System.out.printf("%s is Palindrom", word);
        } else {
            System.out.printf("%s is not a Palindrom", word );
        }
    }
}
