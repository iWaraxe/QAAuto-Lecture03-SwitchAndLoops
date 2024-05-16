package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * This class demonstrates an advanced use of the switch-case statement in Java with string values.
 */
public class AdvancedSwitchExample {
    public static void main(String[] args) {
        String day = "Tuesday";

        // Switch-case using string values
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week");
                break;
            case "Tuesday":
                System.out.println("Second day of the work week");
                break;
            case "Wednesday":
                System.out.println("Midweek");
                break;
            case "Thursday":
                System.out.println("Almost the weekend");
                break;
            case "Friday":
                System.out.println("Last working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println("Today is " + day);
    }
}
