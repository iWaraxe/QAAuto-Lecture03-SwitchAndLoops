package com.coherentsolutions.java.webauto.section02;

/**
 * This class demonstrates the condition check feature of the while loop in Java.
 */
public class WhileLoopConditionCheck {
    public static void main(String[] args) {
        int x = 20;

        // While loop with condition that will not be true initially
        while (x < 15) {
            System.out.print("This will not be printed because x is not less than 15.");
            x++;
            System.out.print("\n");
        }

        System.out.println("While loop condition was false from the beginning.");
    }
}
