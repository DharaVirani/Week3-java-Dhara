package week3java;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //Scanner user input

        System.out.println("Enter a number: ");    //Ask user to input a number
        int a = scanner.nextInt();

        checkNumber(a);                    //called static method

        scanner.close();


    }

    public static void checkNumber(int a) {       //created a static method
        String result = a % 2 == 0 ? "even" : "odd"; //using ternary operator to get result in String even or odd
        System.out.println(result);              //printed the result

    }
}
