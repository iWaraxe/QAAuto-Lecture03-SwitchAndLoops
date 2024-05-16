package com.coherentsolutions.java.webauto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);

        int max, min;

        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > a && b > c && b > d) {
            max = b;
        } else if (c > a && c > b && c > d) {
            max = c;
        } else {
            max = d;
        }

        if (a < b && a < c && a < d) {
            min = a;
        } else if (b < a && b < c && b < d) {
            min = b;
        } else if (c < a && c < b && c < d) {
            min = c;
        } else {
            min = d;
        }

        System.out.println(max);
        System.out.println(min);

        String maxType = (max % 2 == 0) ? "even" : "odd";
        String minType = (min % 2 == 0) ? "even" : "odd";

        System.out.println("Variable " + max + " is " + maxType);
        System.out.println("Variable " + min + " is " + minType);
        System.out.println("Square product of maximum and minimum is " +
                (max * max * min * min));
    }
}