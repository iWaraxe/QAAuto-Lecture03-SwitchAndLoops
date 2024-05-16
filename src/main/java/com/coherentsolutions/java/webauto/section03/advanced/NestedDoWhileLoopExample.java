package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * This class demonstrates the use of nested do-while loops in Java.
 */
public class NestedDoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;

        // Outer do-while loop
        do {
            int j = 1;

            // Inner do-while loop
            do {
                System.out.println("i: " + i + ", j: " + j);
                j++;
            } while (j <= 3);
            i++;
        } while (i <= 3);
    }
}
