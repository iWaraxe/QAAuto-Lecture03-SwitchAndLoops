// File: com/coherentsolutions/java/webauto/section04.advanced/NestedForLoopExample.java
package com.coherentsolutions.java.webauto.section04.advanced;

/**
 * This class demonstrates the use of nested for loops in Java.
 */
public class NestedForLoopExample {
    public static void main(String[] args) {
        // Outer for loop
        for (int i = 1; i <= 3; i++) {
            // Inner for loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
