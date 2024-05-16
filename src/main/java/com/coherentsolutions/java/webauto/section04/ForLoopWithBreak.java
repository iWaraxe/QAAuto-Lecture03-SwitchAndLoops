package com.coherentsolutions.java.webauto.section04;

/**
 * This class demonstrates the use of the break statement in a for loop.
 */
public class ForLoopWithBreak {
    public static void main(String[] args) {
        // For loop to print values of x until it is 12, then break the loop
        for (int x = 10; x < 15; x++) {
            if (x == 12) {
                break; // Exit the loop when x is 12
            }
            System.out.print("Value of x: " + x);
            System.out.print("\n");
        }
    }
}
