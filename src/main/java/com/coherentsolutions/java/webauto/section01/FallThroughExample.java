package com.coherentsolutions.java.webauto.section01;

/**
 * This class demonstrates the fall-through behavior of the switch-case statement in Java.
 */
public class FallThroughExample {
    public static void main(String[] args) {
        int day = 2;

        // Switch-case demonstrating fall-through behavior
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
