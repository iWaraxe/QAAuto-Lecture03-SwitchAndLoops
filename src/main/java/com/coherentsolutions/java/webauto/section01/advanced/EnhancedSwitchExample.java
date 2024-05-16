// File: com/coherentsolutions/java/webauto/section01/advanced/EnhancedSwitchExample.java
package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * This class demonstrates the use of the enhanced switch statement available in Java 12 and later.
 */
public class EnhancedSwitchExample {
    public static void main(String[] args) {
        int month = 8;

        // Enhanced switch statement
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };

        System.out.println("Month: " + month);
        System.out.println("Season: " + season);
    }
}
