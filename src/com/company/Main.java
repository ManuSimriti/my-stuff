package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        /* *****************Code for declaring an array of 10 natural numbers**************************** */
        float dec[] = new float[10];

        for (int i = 0; i< 10; i++){
            dec[i] = i+1;
        }
        for (int i = 0; i< 10; i++){
            System.out.println(dec[i]);
        }
        /* *****************Code for declaring an array and sum of each row **************************** */
        int marks[][] = new int[][]{
                {2, 3, 4},
                {4, 5, 6},
                {6, 7, 8},
                {3, 4, 3},
                {5, 6, 3}

        };
        int s = 0;
        for(int i = 0; i<marks[0].length; i++){

            s = s + marks[i];
        }
        /* *****************Code for calcualting BMI **************************** */
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your height in m:  ");
        double height = a.nextDouble();
        System.out.println("Enter your weight in kgs: ");
        long weight = a.nextLong();
        System.out.println(bmi(height,weight));

    }
    public static long bmi(double height, long weight){
        long bmi = (long) (weight / (height * height));
        return bmi;


    }

}
