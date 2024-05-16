package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates the use of the switch-case statement in Java.
 */
public class SwitchExample {
    public static void main(String[] args) {
        // Example grade
        char grade = 'B';

        // Switch-case to determine the message based on the grade
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
