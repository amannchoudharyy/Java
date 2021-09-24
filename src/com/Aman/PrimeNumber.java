package com.Aman;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number you want to check for prime number");
       int num = in.nextInt();
     int i = 0;
        for (i = 2; i < num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("number is non prime");
                break;
            }
        }
        if (i == num)
        {
            System.out.println("number is prime");
        }

    }
}
