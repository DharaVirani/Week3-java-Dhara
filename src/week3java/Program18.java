package week3java;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Program18 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int size= scanner.nextInt();

        int a[]=new int [size];                           //declared an array a

        System.out.println("Enter elements of an array: ");
        for(int i=0;i<size;i++){       //taking elements one by one
          a[i]= scanner.nextInt();      //taking elements in which we declared array
        }
        int sum= sum(a);                      //sum is according to entered value by user and called static method
        System.out.println("Sum is " + sum);   //Print statement

        scanner.close();
    }

    public static int sum(int a[]){          //method which takes params
     int sum=0;                     //initialized sum with default value
     for(int i=0;i<a.length;i++){
        sum+=a[i];                    //logic
     }
     return sum;                     //return type method used return keyword to get sum
    }

}
