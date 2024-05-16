package com.coherentsolutions.java.webauto.section03;

/**
 * This class demonstrates the basic use of the do-while loop in Java.
 */
public class DoWhileLoopBasicExample {
    public static void main(String[] args) {
        int x = 10;

        // Do-while loop to print values of x from 10 to 14
        do {
            System.out.print("Value of x: " + x);
            x++;
            System.out.print("\n");
        } while (x < 15);
    }
}
