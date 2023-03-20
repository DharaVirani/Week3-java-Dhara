package week3java;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //asked user input

        System.out.println("Enter a number: ");   //asked user input
        int a = scanner.nextInt();

        inputNumber(a);                             //called static method

        scanner.close();
    }

    public static void inputNumber(int a) {            //declared static method and applying logic with condition
        if (a % 2 == 0) {
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }
    }
}
