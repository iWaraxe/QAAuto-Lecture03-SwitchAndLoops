package com.coherentsolutions.java.webauto.section05.advanced;

/**
 * This class demonstrates the use of a break statement with a flag in nested loops.
 */
public class AdvancedBreakWithFlagExample {
    public static void main(String[] args) {
        boolean flag = false;

        // Outer loop
        for (int i = 1; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= 5; j++) {
                if (i * j > 6) {
                    flag = true; // Set the flag to true
                    break; // Exit the inner loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
            if (flag) {
                break; // Exit the outer loop
            }
        }
    }
}
