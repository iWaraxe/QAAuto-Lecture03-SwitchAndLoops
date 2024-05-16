package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * This class demonstrates the use of nested while loops in Java.
 */
public class NestedWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Outer while loop
        while (i <= 3) {
            int j = 1;

            // Inner while loop
            while (j <= 3) {
                System.out.println("i: " + i + ", j: " + j);
                j++;
            }
            i++;
        }
    }
}
