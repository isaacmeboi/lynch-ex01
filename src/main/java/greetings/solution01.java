/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Isaac Lynch
 */
package greetings;
import java.util.Scanner;
public class solution01 {
        public static void main(String[] args) {
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.print("What is your name?");
            name = sc.nextLine(); // reads name from user

            System.out.print("It's a pleasure to meet you," + name); // display sum
        }
    }// end method main

/*very simple, first we import java.util so that we can have the scanner function
to read in the inputs from the "greetee". then, the scanner function must be
declared and an instance of the scanner class must be created. after that the system
prints out a simple question, the "print" instead of "println" allows for the input
to be put on the same line. the code in line 8 reads the name typed in and then the
final line of code prints that with the computer's greeting.
 */