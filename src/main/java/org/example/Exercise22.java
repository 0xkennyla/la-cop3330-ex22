/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise22 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        System.out.println("Enter the third number:");
        int third = scan.nextInt();

        if(first!=second && first!=third && second!=third) {
            if (first > second && first > third)
                System.out.println("The largest number is " + first + ".");
            else if (second > first && second > third)
                System.out.println("The largest number is " + second + ".");
            else
                System.out.println("The largest number is " + third + ".");
        }
       else System.out.println("Please enter 3 different numbers.");
    }
}