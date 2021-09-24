package com.Aman;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please input two numbers");
        float num1 = in.nextFloat(), num2 = in.nextFloat();
         System.out.println("please enter the type of operation you want to perform ");
         String op = in.next();
         float ans = 0;
        switch (op) {
            case "+" -> {
                 ans = num1 + num2;
                break;
            }
            case "-" -> {
                 ans = num1 - num2;
                break;
            }
            case "/" -> {
                 ans = num1 / num2;
                break;
            }
            case "*" -> {
                 ans = num1 * num2;
                break;
            }
        }
        System.out.println(ans);
        
    }

}

