// File: com/coherentsolutions/java/webauto/section03/DoWhileLoopSumExample.java
package com.coherentsolutions.java.webauto.section03;

import java.util.Scanner;

/**
 * This class demonstrates the use of a do-while loop to calculate the sum of user-entered numbers.
 */
public class DoWhileLoopSumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        // Do-while loop to calculate sum of numbers entered by the user
        do {
            System.out.println("Enter a number (negative number to quit): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }
}
