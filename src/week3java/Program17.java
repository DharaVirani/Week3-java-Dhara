package week3java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Sort numeric array
        System.out.println("Enter size of a numeric array: ");   //sort numeric array by asking size
        int size = scanner.nextInt();

        int a[] = new int[size];                         //declared array to store size

        System.out.println("Enter elements of an array: ");  //And asking elements of array
        for (int i = 0; i < size; i++) {                              //asking to enter one by one
            a[i] = scanner.nextInt();                           //stored to array whatever user has input
        }
        sortNumericArray(a);                              //called outside method
        System.out.println("Sorted numeric array: " + Arrays.toString(a));

        //Sort String array

        System.out.println("Enter the size of string array: ");  //asked for size of array
        int size2 = scanner.nextInt();

        String a2[] = new String[size2];            //declared a string array

        System.out.println("Enter elements of string array: "); //asked all elements of array
        for (int i = 0; i < size2; i++) {
            a2[i] = scanner.next();
        }
        sortStringArray(a2);
        System.out.println("Sorted string array " + Arrays.toString(a2));

        scanner.close();

    }

    public static void sortNumericArray(int a[]) {       //static method created to sort numeric arrays
        Arrays.sort(a);                               //Arrays.sort method used which return sorted array
    }

    public static void sortStringArray(String a2[]) {      //static method to sort String array
        Arrays.sort(a2);
    }
}
