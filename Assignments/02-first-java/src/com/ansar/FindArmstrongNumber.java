package com.ansar.assignment;

import java.util.Scanner;

/**
 * To find Armstrong Number between two given number.
 * abcd... = an + bn + cn + dn + ...
 * eg: 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
 * <p>
 * pseudo code:
 * Input two number startNumber endNumber
 * for number = startNumber to number <= endNumber number++
 * Initialise digits = 0, result = 0 and originalNumber = number
 * Find total number of digits in number
 * while originalNumber != 0
 * ++digits
 * originalNumber /= 10
 * originalNumber = number
 * Repeat until (originalNumber != 0)
 * remainder = originalNumber % 10
 * result += pow(remainder, digits)
 * originalNumber /= 10
 * if (result == number)
 * print "number"
 */
public class FindArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start/low number");
        int startNumber = scanner.nextInt();

        System.out.println("Enter end/high number");
        int endNumber = scanner.nextInt();

        //Iterate between start and end number to print armstrong numbers
        for (int number = startNumber; number <= endNumber; number++) {

            int digits = 0, result = 0, originalNumber = number;

            //Find number of digits
            while (originalNumber != 0) {
                ++digits;
                //compound division assignment
                originalNumber /= 10;
            }
            originalNumber = number;
            //sum each digit with nth power
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                //x += y is equivalent to x = (type of x) (x + y)
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
            if(number ==  result) {
                System.out.print(number + " ");
            }

        }
    }
}
