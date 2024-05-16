package com.coherentsolutions.java.webauto.section04.advanced;

import java.util.Iterator;
import java.util.List;

/**
 * This class demonstrates the use of the enhanced for loop (for-each loop) in Java.
 */
public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("---Array initial values---");
        for (int i=0; i<numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
            numbers[i] = 2 * numbers[i];
        }

        System.out.println("---Array values have changed---");

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        System.out.println("---For each loop elements multiplied---");
        // Enhanced for loop to iterate through an array
        for (Integer number : numbers) {
            number = number * 2;
            System.out.println("Number: " + number);
        }

        System.out.println("---For each loop doesn't change array---");

        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
