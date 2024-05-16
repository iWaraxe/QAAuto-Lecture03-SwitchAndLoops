package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * This class demonstrates the use of the break statement in a while loop.
 */
public class WhileLoopBreakExample {
    public static void main(String[] args) {
        int x = 0;

        // While loop to find the first number greater than 5
        while (x <= 10) {
            if (x > 5) {
                break; // Exit the loop when x is greater than 5
            }

            System.out.println("Current number: " + x);
            x++;
        }

        System.out.println("First number greater than 5: " + x);
    }
}
