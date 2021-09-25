package com.Aman;

import java.util.Scanner;

//this program is to find how many times a digit is repeating in a number
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number");
        long num = in.nextLong();
        System.out.println("please enter a digit ");
        int digit = in.nextInt();
        int count = 0;
        while (num > 0) {
            long rem = num % 10;
            if (rem == digit) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("the digit " + digit + " is repeating " + count + " times");
    }
}
