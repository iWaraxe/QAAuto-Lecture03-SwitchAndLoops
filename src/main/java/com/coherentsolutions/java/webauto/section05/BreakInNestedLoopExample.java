package com.coherentsolutions.java.webauto.section05;

/**
 * This class demonstrates the use of the break statement inside nested loops.
 */
public class BreakInNestedLoopExample {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break; // Exit the inner loop when j is 2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
