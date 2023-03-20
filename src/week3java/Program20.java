package week3java;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */

public class Program20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();     //take the input from the user

        int a[] = new int[size];         //declared an array of size

        System.out.println("Enter the elements:"); //take the input from the user for elements one by one using for
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to test:"); //take the value from user to test that it contains specified value or not
        int value = scanner.nextInt();

        if (contains(a, value)) {                         //if array contains the value
            System.out.println("The array contains " + value); //we print we found or not
        } else {
            System.out.println("The array does not contain " + value);
        }
        scanner.close();


    }

    public static boolean contains(int a[], int value) {  //We created contains method which returns boolean and 2 params
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {                    //We check whether the target value was found in array or not
                return true;                       //return true if it contains
            }
        }
        return false;                              //or else false if not
    }
}





