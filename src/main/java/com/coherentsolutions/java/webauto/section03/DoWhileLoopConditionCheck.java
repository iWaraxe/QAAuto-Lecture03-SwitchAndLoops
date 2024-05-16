package com.coherentsolutions.java.webauto.section03;

/**
 * This class demonstrates the condition check feature of the do-while loop in Java.
 */
public class DoWhileLoopConditionCheck {
    public static void main(String[] args) {
        int x = 20;

        // Do-while loop with condition that will not be true initially
        do {
            System.out.println("Value of x: " + x);
            System.out.print("This will be printed once even though x is not less than 15.");
            x++;
            System.out.print("\n");
        } while (x < 15);

        System.out.println("Do-while loop condition was false after the first iteration.");
    }
}
