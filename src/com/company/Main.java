package com.company;

public class Main {

    public static void main(String[] args)  {
        String name = "mom";
        char[] chars = name.toCharArray();
        System.out.println(chars);
        char[] rev = new char[name.length()];
        int length = chars.length;
        int lastIndex = length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            rev[lastIndex - i] = chars[i];
        }
        String revv = new String(rev);
        System.out.println(revv);
        if (name.equals(revv)) {
            System.out.println("it's a palindrome string");
        } else {
            System.out.println("it's not a palindrome string");
        }

/*
        #################### Object made for testing Exception ##############################
*/
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.checkEligibility(30,55);
        } catch (ExceptionDemo.notEligible e) {
            e.printStackTrace();
        }

    }
}
