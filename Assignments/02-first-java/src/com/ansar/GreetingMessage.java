package com.ansar.assignment;

import java.util.Scanner;

/**
 * Take name as input and print a greeting message for that particular name.
 * start -> Enter name -> Display greeting -> Stop
 */
public class GreetingMessage {
    public static void main(String[] args) {
        System.out.print("Please Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hi! %s", name);
    }
}
