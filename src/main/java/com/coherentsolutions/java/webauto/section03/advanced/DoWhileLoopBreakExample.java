package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * This class demonstrates the use of the break statement in a do-while loop.
 */
public class DoWhileLoopBreakExample {
    public static void main(String[] args) {
        int x = 0;

        // Do-while loop to find the first number greater than 5
        do {
            if (x > 5) {
                break; // Exit the loop when x is greater than 5
            }

            System.out.println("Current number: " + x);
            x++;
        } while (x <= 10);

        System.out.println("First number greater than 5: " + x);
    }
}
