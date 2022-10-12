package com.ansar;

/**
 * 25. Kunal is allowed to go out with his friends only on the even days of a given month.
 * Write a program to count the number of days he can go out in the month of August.
 * <p>
 * input numOfDays, init count = 0
 * for i = 1 to i <= numOfDays
 * if i % 2 == 0 then count++
 * end loop
 * print count
 */
public class KunalGo_out_Even_Days {
    public static void main(String[] args) {
        int numOfDaya = 31, count = 0;

        for (int i = 1; i <= numOfDaya; i++) {
            //another logic
            // numOfDays / 2 = he can go out on even days.
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of days Kunal can go in august " + count);
    }
}
