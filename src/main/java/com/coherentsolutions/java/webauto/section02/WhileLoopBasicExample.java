package com.coherentsolutions.java.webauto.section02;

/**
 * This class demonstrates the basic use of the while loop in Java.
 */
public class WhileLoopBasicExample {
    public static void main(String[] args) {
        int x = 10;

        // While loop to print values of x from 10 to 14
        while (x < 15) {
            System.out.print("Value of x: " + x);
            x++;
            System.out.print("\n");
        }
    }
}
