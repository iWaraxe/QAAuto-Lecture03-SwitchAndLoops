package com.coherentsolutions.java.webauto.section01;

import java.util.Random;

/**
 * This class uses the switch-case statement to determine the season based on a randomly generated month number.
 */
public class MonthSwitchExample {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(13); // Generates a random month number between 0 and 12

        // Switch-case to determine the season
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error: Invalid month");
        }
        System.out.println("Randomly generated month: " + month);
    }
}
