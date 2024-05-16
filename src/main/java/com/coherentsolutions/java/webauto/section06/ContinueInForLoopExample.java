// File: com/coherentsolutions/java/webauto/section06/ContinueInForLoopExample.java
package com.coherentsolutions.java.webauto.section06;

/**
 * This class demonstrates the use of the continue statement in a for loop.
 */
public class ContinueInForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // For-each loop to iterate through the array
        for (int x : numbers) {
            if (x == 30) {
                continue; // Skip the current iteration when x is 30
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
