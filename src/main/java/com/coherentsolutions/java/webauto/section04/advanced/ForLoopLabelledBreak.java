package com.coherentsolutions.java.webauto.section04.advanced;

/**
 * This class demonstrates the use of a labelled break statement in nested for loops.
 */
public class ForLoopLabelledBreak {
    public static void main(String[] args) {
        // Label for the outer loop
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i * j > 6) {
                    break outerLoop; // Break the outer loop if the condition is met
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
