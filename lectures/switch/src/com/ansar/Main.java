package com.ansar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cars car;
        car = Cars.SWIFT;

        switch (car) {
            case KWID:
                System.out.println("KWID is selected");
                break;
            case BMW:
                System.out.println("BMW is selected");
                break;
            case THAR:
                System.out.println("THAR is selected");
                break;
            case SWIFT:
                System.out.println("SWIFT is selected");
                break;
            default:
                System.out.println("select valid car");
        }
    }
}
