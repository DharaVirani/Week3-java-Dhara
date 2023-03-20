package week3java;
/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Program3 {
    static String name;
    static int rollNo;
    static int math;
    static int science;
    static int english;
    static int total;
    static double percentage;
    static String grade;
    static String result;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");    //Asked for student name
        String name = scanner.nextLine();

        System.out.println("Enter Roll no: "); //asked user input
        int rollNo = scanner.nextInt();

        System.out.println("Enter marks (out of 100) for 3 subjects"); //Asking user to enter marks in all 3 subject out of 100

        System.out.println("Enter Math marks: ");       //asking user for math marks
        int math = scanner.nextInt();                    //reading math marks provided by student

        System.out.println("Enter Science Marks: ");    //asking user to enter science marks
        int science = scanner.nextInt();

        System.out.println("Enter English marks: ");    //asking user to enter  English marks
        int english = scanner.nextInt();

        //to check valid marks
        if (math < 0 || math > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid Input,Marks should be between 0 to 100");  //statement if it's not correct;
            return;
        }
        //calculate total,percentage and result
        int total = math + science + english;
        double percentage = (double) total / 3;
        if (percentage >= 35) {
            result = "Pass";
            System.out.println(result);
        } else {
            result = "Fail";
            System.out.println(result);
        }
        //to get grade
        if (percentage > 80 && percentage < 100) {
            grade = "A+";
        } else if (percentage < 80 && percentage >= 60) {
            grade = "A";
        } else if (percentage < 60 && percentage >= 50) {
            grade = "B";
        } else if (percentage < 50 && percentage >= 35) {
            grade = "C";
        } else {
            grade = "D";
        }
        //to display mark sheet
        System.out.println("-----------------------------------");
        System.out.println("|                                 |");
        System.out.println("|         Mark Sheet              |");
        System.out.println("|_________________________________|");
        System.out.println("|Name       :" + name + "               |");
        System.out.println("|Roll No    :" + rollNo + "                  |");
        System.out.println("|_________________________________|");
        System.out.println("|Subject     :      Marks         |");
        System.out.println("|Math        :" + math + "                  |");
        System.out.println("|Science     :" + science + "                  |");
        System.out.println("|English     :" + english + "                  |");
        System.out.println("|_________________________________|");
        System.out.println("|Total       :" + total + "                 |");
        System.out.println("|Percentage  :" + percentage + "    |");
        System.out.println("|Result      :" + result + "                |");
        System.out.println("|Grade       :" + grade + "                  |");
        System.out.println("|_________________________________|");

        scanner.close();


    }


}












