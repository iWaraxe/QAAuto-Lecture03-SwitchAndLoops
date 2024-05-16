// File: com/coherentsolutions/java/webauto/section03/DoWhileLoopUserInput.java
package com.coherentsolutions.java.webauto.section03;

import java.util.Scanner;

/**
 * This class demonstrates the use of a do-while loop with user input.
 */
public class DoWhileLoopUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Do-while loop to continue reading user input until "exit" is entered
        do {
            System.out.println("Enter some text (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Program exited based on user input.");
        scanner.close();
    }
}
