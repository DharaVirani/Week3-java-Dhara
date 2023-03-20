package week3java;
/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program2 {

    public static void isLeapYear(int y) {                 //declared a static method


        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {    //placed logic in the static method with if else condition
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not a leap year");

        }

    }

    public static void main(String[] args) {          //main method
        Scanner scanner = new Scanner(System.in);     //for user input

        System.out.println("Enter a year: ");        //Asking user for input
        int y = scanner.nextInt();                   //Reading input

        isLeapYear(y);                              //called static method

        scanner.close();

    }


}
