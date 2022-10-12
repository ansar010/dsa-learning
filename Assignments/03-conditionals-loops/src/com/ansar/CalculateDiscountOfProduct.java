package com.ansar;

/**
 * input product amount, discount percentage
 * discountRate = product amount * discount percentage / 100
 * amount after discount = product amount - discountRate
 */
public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        int pAmount = 200;
        float dPercent = 3.5f;
        double discountOfProdcut = 0.0, amountAfterDis = 0.0;
        discountOfProdcut = (pAmount * dPercent) / 100;
        amountAfterDis = pAmount - discountOfProdcut;
        System.out.println(amountAfterDis);
    }
}
