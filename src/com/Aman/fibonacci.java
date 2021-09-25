package com.Aman;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;

        int n3 = 0;
        String ab = "";
        System.out.println("THIS PROGRAM IS TO print FIBONACCI NUMBER till nth number");
        System.out.println("please enter nth number ");
        int n = in.nextInt();
        switch (n) {
            case 2 -> {
                ab = "nd";
                break;
            } case 3 -> {
                ab = "rd";
                break;
            }
            default -> {
                ab = "th";
            }
        }
        if (n == 1) {
            System.out.println(n1);
            System.out.println("the 1st fibonacci number will be 0");
        } else {
            if (2 <= n) {
                System.out.print(n1 + " " + n2);
            }


//        System.out.print(n1 + " " + n2);
            for (int i = 3; i <= n; i++) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            System.out.println("");
            System.out.println("the " + n + ab +" fibonacci number will be " + n2);
        }
    }
}
