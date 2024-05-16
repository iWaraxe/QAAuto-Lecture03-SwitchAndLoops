package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * This class demonstrates the use of the continue statement in a do-while loop.
 */
public class DoWhileLoopContinueExample {
    public static void main(String[] args) {
        int x = 0;

        // Do-while loop to print even numbers between 0 and 10
        do {
            x++;

            if (x % 2 != 0) {
                continue; // Skip the rest of the loop body for odd numbers
            }

            System.out.println("Even number: " + x);
        } while (x <= 10);
    }
}
