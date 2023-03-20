package week3java;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */

public class Program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                  //asked for user input

        System.out.println("------------------------------------"); //print display
        System.out.println("|          Salary Slip             |");
        System.out.println("|----------------------------------|");
        System.out.print("|Employee Id :");                           //asking for user input
        int x = scanner.nextInt();
        System.out.print("|Employee Name:");                         //asking for user input
        String y = scanner.next();
        System.out.print("|Basic Salary  :");                       //asking for user input
        double a = scanner.nextDouble();
        grossSalary(a);                                             //calling static method

        scanner.close();

    }

    public static void grossSalary(double a) {                       //declared static method and applied logic
        double res = a * 0.10;
        double res1 = a * 0.08;
        double res2 = a * 0.09;
        double res3 = a * 0.20;
        double res4 = a + res + res1 + res2 - res3;

        System.out.println("|HRA 10%       :" + res + "             |"); //printed the logic
        System.out.println("|TA 8%         :" + res1 + "             |");
        System.out.println("|DA 9%         :" + res2 + "             |");
        System.out.println("|PF 20%        :" + res3 + "            |");
        System.out.println("|__________________________________|");
        System.out.println("|Gross Salary  :" + res4 + "            |");
        System.out.println("|==================================|");

    }
}
