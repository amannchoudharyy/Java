package com.Aman;

import java.util.Scanner;

public class tempratureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println("tempeature in farenheit is " + tempf);

    }
}