package com.coherentsolutions.java.webauto.section06.advanced;

/**
 * This class demonstrates the use of the continue statement in nested loops.
 */
public class ContinueInNestedLoopExample {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue; // Skip the rest of the inner loop body when j is 2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
