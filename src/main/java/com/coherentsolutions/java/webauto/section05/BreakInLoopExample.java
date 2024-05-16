// File: com/coherentsolutions/java/webauto/section05/BreakInLoopExample.java
package com.coherentsolutions.java.webauto.section05;

/**
 * This class demonstrates the use of the break statement inside a loop.
 */
public class BreakInLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // For-each loop to iterate through the array
        for (int x : numbers) {
            if (x == 30) {
                break; // Exit the loop when x is 30
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
