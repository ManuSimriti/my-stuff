package com.company;
public class ExceptionDemo {
public void checkEligibility(int age, int weight) throws notEligible {
        if (age > 18 && weight > 50) {
            System.out.println("Welcome to the blood donation camp");
        } else {
            throw new notEligible("This person is not eligible");
        }

    }
    class notEligible extends Exception{
        public notEligible(String message) {
            super(message);
        }
    }

}
