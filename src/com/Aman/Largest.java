package com.Aman;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("THIS PROGRAM IS TO FIND THE LARGEST NUMBER B/W THREE");
        System.out.println("please put three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

//        METHOD 1
        /*
        if (num1 >num2){
            if(num1 > num3){
                System.out.println(num1 + " is the largest number");
            }
            else{
                System.out.println(num3 + " is the largest number");
            }
        }
        else {
            if(num2 > num3){
                System.out.println(num2 + " is the largest number");
            }
            else{
                System.out.println(num3 + " is the largest number");
            }

        }   */
//        method 2
        /*
        int max = num1;
        if (max < num2){
           max = num2;
        }
        if (max < num3){
            max = num3;
        }
        System.out.println(max + " is the largest number");
         */
//        METHOD 3
        int maximum = Math.max(num3, Math.max(num1,num2));
        System.out.println(maximum +  " is the largest number");


    }
}
