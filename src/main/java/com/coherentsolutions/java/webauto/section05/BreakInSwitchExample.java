package com.coherentsolutions.java.webauto.section05;

/**
 * This class demonstrates the use of the break statement inside a switch-case statement.
 */
public class BreakInSwitchExample {
    public static void main(String[] args) {
        char grade = 'B';

        // Switch-case statement to determine the message based on the grade
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
