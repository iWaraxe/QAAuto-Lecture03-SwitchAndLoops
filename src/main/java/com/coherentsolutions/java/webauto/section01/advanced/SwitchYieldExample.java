package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * This class demonstrates the use of the yield statement in an enhanced switch block.
 */
public class SwitchYieldExample {
    public static void main(String[] args) {
        int score = 55;

        // Enhanced switch with yield statement
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                if (score < 60) yield "F";
                else yield "Invalid";
            }
        };

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
