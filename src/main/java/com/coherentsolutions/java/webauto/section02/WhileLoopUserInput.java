package com.coherentsolutions.java.webauto.section02;

import java.util.Scanner;

/**
 * This class demonstrates the use of a while loop with user input.
 */
public class WhileLoopUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // While loop to continue reading user input until "exit" is entered
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Enter some text (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }

        System.out.println("Program exited based on user input.");
        scanner.close();
    }
}
