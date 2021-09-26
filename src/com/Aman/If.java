package com.Aman;

import java.util.Objects;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("THIS PROGRAM IS TO PERFORM A * / + - OPERATION IN GIVEN TWO NUMBERS");
        System.out.println("please enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        System.out.println("please enter the operaion you want to perform with these numbers");
        String op = in.next();
        if (op.equals("+")){
            ans = num1+num2;
        }
                if (op.equals("-")){
            ans = num1-num2;
        }
                if (op.equals("*")){
            ans = num1*num2;
        }
                if (op.equals("/")){
            ans = num1/num2;
        }
        System.out.println("your answer is " + ans);

    }
}
