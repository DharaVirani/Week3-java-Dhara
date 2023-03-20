package week3java;
/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //user input

        System.out.println("Enter a value: ");    //asking user
        char input = scanner.next().charAt(0);    //taking char value from user

        checkValue(input);                      //calling static method to perform task on user input
        scanner.close();
    }

    public static void checkValue(char input) {   //declared static method with params and no return type
        if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) { //given condition should fulfill
            System.out.println("It's an alphabet");                       //to execute this statement
        } else if (input >= '0' && input <= '9') {                         //given condition should fulfill
            System.out.println("It's a number");                          //to execute this statement
        } else
            System.out.println("It's a symbol");                          //otherwise this will execute
    }
}
