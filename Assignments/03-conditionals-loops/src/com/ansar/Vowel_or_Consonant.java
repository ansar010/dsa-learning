package com.ansar;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().toLowerCase().trim().charAt(0);
        if (c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u') {
            System.out.println("The given char is vowel");
        } else {
            System.out.println("The given char is consonant");
        }
    }
}
