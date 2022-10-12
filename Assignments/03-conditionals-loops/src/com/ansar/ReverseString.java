package com.ansar;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Albert";
        int length = name.length() - 1;
        String revStr = "";

        for (int i = length; i >= 0; i--) {
            revStr += name.charAt(i);
        }
        System.out.println(revStr);
    }
}
