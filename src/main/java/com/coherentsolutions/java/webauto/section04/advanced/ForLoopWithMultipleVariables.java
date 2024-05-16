package com.coherentsolutions.java.webauto.section04.advanced;

/**
 * This class demonstrates the use of a for loop with multiple variables.
 */
public class ForLoopWithMultipleVariables {
    public static void main(String[] args) {
        // For loop with two variables
        for (int i = 1, j = 10; i <= 12 && j >= 1; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
    }
}
