package week3java;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class Program19 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //reading user input that is array size
        System.out.println("Enter array size: "); //Asking for input
        int size = scanner.nextInt();            //Reading the input
        int a[] = new int[size];                    //declared an array of size

        System.out.println("Enter array values: "); //asking user input
        for (int i = 0; i < size; i++) {                 //ask for input one by one
            a[i] = scanner.nextInt();              //taking the value in array
        }
        double average = average(a);                 //call static method
        System.out.println("The average of the array values are " + average);    //printed the average value

        scanner.close();
    }

    public static double average(int a[]) {
        int sum = 0;                             //initialized sum
        for (int i = 0; i < a.length; i++) {
            sum += a[i];                        //calculated the sum of array values
        }
        return (double) sum / a.length;        //return the average as double
    }
}
