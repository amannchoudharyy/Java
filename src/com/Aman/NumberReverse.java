package com.Aman;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("THIS PROGRAM IS TO REVERSE THE DIGITS OF A GIVEN NUMBER");
        System.out.println("please enter a number ");
        long num = in.nextLong();
        long ans = 0;
        while (num > 0) {
            long rem = num % 10;

            ans = (ans * 10) + rem;
            num = num / 10;

        }
        System.out.println(ans);

    }
}
