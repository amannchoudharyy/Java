package com.Aman;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("what is the salary");
        int salary = in.nextInt();
         if (salary < 10000)
         {
             salary =salary+1000;
             System.out.println("your bonus is 1000");
             System.out.println("your total salary will be " + salary);
         }
         else
         {
             salary =salary+2000;
             System.out.println("your bonus is 2000");
             System.out.println("your total salary will be " + salary);

         }

    }
}
