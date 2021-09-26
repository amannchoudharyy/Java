package com.Aman;

import java.util.Scanner;

public class FruitDescribe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the name of fruit");
        String fruit = in.next();
        switch (fruit){
            case "apple":
                System.out.println("RED color");
                break;
                case "mango":
                System.out.println("YELLOW color");
                break;
                case "grapes":
                System.out.println("GREEN color");
                break;
                case "orange":
                System.out.println("ORANGE color");
                break;
            default:
                System.out.println("PLEASE ENTER A VALID FRUIT NAME");

        }
    }
}
