package com.ansar;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array for primitive
        int[] num = new int[5];

        //Array for Non-Primitive
        String[] names = new String[5];

        //Loop to fill primitive array
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        //loop to Print primitive array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        //loop to fill Non-Primitve Array using for each loop
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        //loop to print Non-primitive array. Using for each loop here.
        for (String element: names) {
            System.out.print(element + " ");
        }
    }
}
