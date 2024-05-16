package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * This class demonstrates the use of the continue statement in a while loop.
 */
public class WhileLoopContinueExample {
    public static void main(String[] args) {
        int x = 0;

        // While loop to print even numbers between 0 and 10
        while (x <= 10) {
            x++;

            if (x % 2 != 0) {
                continue; // Skip the rest of the loop body for odd numbers
            }

            System.out.println("Even number: " + x);
        }
    }
}
