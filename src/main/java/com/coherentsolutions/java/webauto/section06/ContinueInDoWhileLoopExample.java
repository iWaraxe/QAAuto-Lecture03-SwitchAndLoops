package com.coherentsolutions.java.webauto.section06;

/**
 * This class demonstrates the use of the continue statement in a do-while loop.
 */
public class ContinueInDoWhileLoopExample {
    public static void main(String[] args) {
        int x = 0;

        // Do-while loop to print odd numbers between 0 and 10
        do {
            x++;
            if (x % 2 == 0) {
                continue; // Skip the rest of the loop body for even numbers
            }
            System.out.println("Odd number: " + x);
        } while (x < 10);
    }
}
