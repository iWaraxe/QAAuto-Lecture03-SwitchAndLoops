package com.coherentsolutions.java.webauto.section04;

/**
 * This class demonstrates the use of a for loop to calculate the sum of the first 10 natural numbers.
 */
public class ForLoopSumExample {
    public static void main(String[] args) {
        int sum = 0;

        // For loop to calculate the sum of the first 10 natural numbers
        for (int x = 1; x <= 10; x++) {
            sum += x;
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}
