package week3java;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();       //when we read input we store it in int variable called n

        String result = checkNumber(n);               //number check from outside method is stored in string variable named as result
        System.out.println("The number is " + result); //print result

        scanner.close();

    }

    public static String checkNumber(int n) {   //outside method to check number is positive or negative with return type and params
        if (n > 0) {                               //if the condition fulfills
            return "POSITIVE";                //This will apply and used with return keyword because return type method
        } else if (n < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}
