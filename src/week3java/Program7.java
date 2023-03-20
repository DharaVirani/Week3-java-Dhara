package week3java;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //asked for user input

        System.out.println("Sales ID: ");          //asking user to enter sales id
        int a = scanner.nextInt();                  //stored input in a

        System.out.println("Seller's Name: ");     //asking user to enter sellers name
        String b = scanner.next();                  //stored input in b

        System.out.println("Sales amount: ");       //asking user to enter sales amount
        double c = scanner.nextDouble();             //stored input in c

        System.out.println("Basic Salary");         //asked user to input basic salary and stored in d variable
        double d = scanner.nextDouble();

        totalSales(c);                                //called static method which prints total sales
        double totalSalary = d + c;
        System.out.println("Total salary is: " + totalSalary); //printing total salary


        scanner.close();

    }

    public static void totalSales(double c) {          //static method
        double comm;                                   //declared a variable comm
        if (c >= 50000) {                                //condition
            comm = c * 0.35;                            //calculation
            System.out.println("Commission is:" + comm); //printing if the condition matches
        } else if (c >= 30000) {
            comm = c * 0.20;
            System.out.println("Commission is:" + comm);
        } else if (c >= 20000) {
            comm = c * 0.10;
            System.out.println("Commission is:" + comm);
        } else if (c >= 10000) {
            comm = c * 0.05;
            System.out.println("Commission is:" + comm);
        } else {
            comm = c * 0.02;
            System.out.println("Commission is:" + comm);  //printing if no condition matches
        }
        double totalsales = c + comm;
        System.out.println("Total sales is:" + totalsales); //printing total sales done
    }

}

