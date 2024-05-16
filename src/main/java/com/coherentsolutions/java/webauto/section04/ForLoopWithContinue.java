package com.coherentsolutions.java.webauto.section04;

/**
 * This class demonstrates the use of the continue statement in a for loop.
 */
public class ForLoopWithContinue {
    public static void main(String[] args) {
        // For loop to print values of x, skipping 12
        for (int x = 10; x < 15; x++) {
            if (x == 12) {
                continue; // Skip the rest of the loop body for x == 12
            }
            System.out.print("Value of x: " + x);
            System.out.print("\n");
        }
    }
}
