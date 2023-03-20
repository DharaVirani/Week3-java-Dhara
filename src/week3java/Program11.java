package week3java;

import java.util.Scanner;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //user input

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Numbers divisible by 3: "); //Print nos divisible by 3
        printDivisibleNumbers(n, 3);             //calling method

        System.out.println("Numbers divisible by 5: "); //Print nos divisible by 5
        printDivisibleNumbers(n, 5);              //calling method

        scanner.close();


    }

    public static void printDivisibleNumbers(int range, int divisor) { //use 2 args to check 1 to range and divisor
        for (int i = 1; i <= range; i++) {     //for loop to iterate over nos in range and check
            if (i % divisor == 0) {         //if number is divisible by the given divisor using % operator
                System.out.println(i);   //if it is divisible, it will print
            }
        }
    }

}
