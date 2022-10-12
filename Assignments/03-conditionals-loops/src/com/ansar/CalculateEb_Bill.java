package com.ansar;

/**
 * 1 unit = 10 if 0 to 100
 * 1 unit = 15 if 100 to 200
 * 1 unit = 20 if 200 to 300
 * 1 unit = 25 if above 300
 */
public class CalculateEb_Bill {
    public static void main(String[] args) {
        int totalUnit = 250;
        double billAmount = 0;

        if (totalUnit <= 100) {
            billAmount = 10 * totalUnit;
        } else if (totalUnit <= 200) {
            billAmount = (10 * 100) + ((totalUnit - 100) * 15);
        } else if (totalUnit <= 300) {
            billAmount = (10 * 100) + (15 * 100) + ((totalUnit - 200) * 20);
        } else if (totalUnit > 300) {
            billAmount = (10 * 100) + (15 * 100) + (20 * 100) + ((totalUnit - 300) * 25);
        }

        System.out.println("Bill Amount: " + billAmount);
    }
}
