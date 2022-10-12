package com.ansar;

public class NumberOfOccurance {
    public static void main(String[] args) {
        int num = 1785757879;
        int count = 0;
        while (num != 0) {
            int remainder = num % 10;
            if (remainder == 7) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);

//    String s = String.valueOf(num);
//    int count = 0;
//        for (int i = 0; i < s.length() - 1; i++) {
//            if(s.charAt(i) == '7'){
//                count++;
//            }
//        }
//        System.out.println(count);
    }

}
