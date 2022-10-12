package com.ansar;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.printf("%c is a lower case", ch);
        } else {
            System.out.printf("%c is a Upper case", ch);
        }

    }
}
