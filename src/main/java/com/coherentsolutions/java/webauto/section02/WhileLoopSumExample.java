package com.coherentsolutions.java.webauto.section02;

import java.util.Scanner;

/**
 * This class demonstrates the use of a while loop to calculate the sum of user-entered numbers.
 */
public class WhileLoopSumExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        // While loop to calculate sum of numbers entered by the user
        while (true) {
            System.out.println("Enter a number (negative number to quit): ");
            number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }
}
