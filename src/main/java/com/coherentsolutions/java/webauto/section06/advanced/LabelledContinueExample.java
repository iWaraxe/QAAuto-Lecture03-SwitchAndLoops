package com.coherentsolutions.java.webauto.section06.advanced;

/**
 * This class demonstrates the use of a labelled continue statement in nested loops.
 */
public class LabelledContinueExample {
    public static void main(String[] args) {
        // Label for the outer loop
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outerLoop; // Skip the rest of the outer loop body when j is 2
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
