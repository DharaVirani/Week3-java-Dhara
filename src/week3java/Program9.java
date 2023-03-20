package week3java;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement
 */

public class Program9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet from A to F : ");  //asking user to input alphabet
        char ch = scanner.next().charAt(0);                       //used char.At method to take char value

        cityName(ch);//called static method to give answer to user
        
        scanner.close();

    }

    public static void cityName(char ch) {             //declared static method
        String city = "";                               //declatrd variable city
        switch (ch) {                                  //use switch with expression
            case 'A':                                 //case A and A in '' because character
                city = "Ahmedabad";
                break;              //if condition true then city would be executed the specified
            case 'B':
                city = "Bengal";
                break;
            case 'C':
                city = "Chandigarh";
                break;
            case 'D':
                city = "Dehradun";
                break;
            case 'E':
                city = "Edinburgh";
                break;
            case 'F':
                city = "Faridabad";
                break;
            default:                                      //if any other letter entered
                System.out.println("Invalid entry");     //this will execute
        }
        System.out.println("The city for the letter is: " + ch + " is " + city);  //if any of the above condition matches
        //this statement will execute
    }
}
