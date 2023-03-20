package week3java;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //user input

        System.out.println("Enter a number: ");    //asked user to enter a number
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number: ");   //2nd number
        int b = scanner.nextInt();

        System.out.println("Enter a symbol: ");     //a symbol
        char ch = scanner.next().charAt(0);

        symbol(a, b, ch);                             //called static method

        scanner.close();

    }

    public static void symbol(int a, int b, char ch) {   //created static method with params
        if (ch == '+') {                                   //given if the symbol mentioned is specified
            System.out.println("The addition of the number is: " + (a + b)); //this stement will execute
        } else if (ch == '-') {
            System.out.println("The subtraction of the numbers is: " + (a - b));
        } else if (ch == '*') {
            System.out.println("The multiplication of the number is: " + (a * b));
        } else if (ch == '/') {
            System.out.println("The division of the number is: " + (a / b));
        } else {                                       //if any other symbol specified other than above ones
            System.out.println("Invalid symbol");  //this stement will execute
        }
    }
}
