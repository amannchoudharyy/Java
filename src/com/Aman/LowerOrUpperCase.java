package com.Aman;

import java.util.Scanner;

public class LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("THIS PROGRAM IS TO CHECK WEATHER CHARECTER IS UPPER CASE OR LOWER CASE");
        System.out.println("please enter some charecter");
        char ch = in.next().trim().charAt(0);
        if (ch>'a' && ch<'z'){
            System.out.println("charecter is in lower case");
        }  else{
            System.out.println("charecter is in upper case");
        }
    }
}
