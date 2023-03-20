package week3java;

import java.util.Scanner;

/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7 : ");  //Take user input
        int n = scanner.nextInt();

        weekDay(n);                                          //called method to perform task

        scanner.close();
    }

    public static void weekDay(int n) {             //declared a method


        //Printing the weekday name if entered between 1 to 7
        String weekDay;
        switch (n) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
            default:                                //default if any other number printed
                weekDay = "Week contains 1 to 7 days ";
        }
        System.out.println("The day of the week for  " + n + " is " + weekDay); //print

    }
}

