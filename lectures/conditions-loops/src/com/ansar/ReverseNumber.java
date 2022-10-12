package com.ansar;

/**
 * input number
 * while number != 0
 * rem = number % 10
 * result += rem
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;

        //with string conversion
//        String result = "";
//        while (number != 0){
//            int rem = number % 10;
//            result += rem;
//            number /= 10;
//        }
//        System.out.println(result);

        //with multiply by 10 so that we can add single digit
        int answer = 0;
        while (number > 0) {
            int rem = number % 10;
            answer = answer * 10 + rem;
            number /= 10;
        }
        System.out.println(answer);
    }
}
