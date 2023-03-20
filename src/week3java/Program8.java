package week3java;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //user input

        System.out.println("Enter an alphabet from A to F : ");  //asking user to input alphabet
        char ch = scanner.next().charAt(0);                       //used char.At method to take char value

        cityName(ch);                                          //called static method to execute user input

        scanner.close();


    }

    public static void cityName(char ch) {             //declared static method
        if (ch == 'A' || ch == 'a') {                          //condition
            System.out.println("Ahmedabad");             //statement if condition is true
        } else if (ch == 'B' || ch == 'b') {                  //condition
            System.out.println("Bengal");               //statement executed if condition is true
        } else if (ch == 'C' || ch == 'c') {
            System.out.println("Chandigarh");
        } else if (ch == 'D' || ch == 'd') {
            System.out.println("Dehradun");
        } else if (ch == 'E' || ch == 'e') {
            System.out.println("Edinburgh");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("Faridabad");
        } else {                                            //if no condition matches
            System.out.println("Invalid Entry");         //this statement will execute
        }
    }


}
