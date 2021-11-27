package bugFighterJavQuest;

import java.util.Scanner;

public class Aug17 {
    public static void main(String[] args) {
        /**
         Q14 - ask user to enter a year, and check if it is leap year
         Leap year : a year that has 29 days in a february
         google for condition of the leap year
         */

     /* divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year1 = scan.nextInt();


        System.out.println(year1 % 100 == 0 && year1 % 400 == 0 ? " is a leap year." :
                year1 % 100 != 0 && year1 % 4 == 0 ? " is a leap year." : " is not a leap year.");


//______________________________________________________________________________________________
        /**
         Q15-
         Write a Java program to find the number of days in a month.(Use Switch Case)
         (Interview Question / Leap Year)
         */
        System.out.println("Enter a month and year to find find number of days ");
        String month = scan.next().toLowerCase();
        int year = scan.nextInt();

        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(year + " " + month + " have 31 days... ");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(year + " " + month + " have 30 days... ");
                break;
            case "february":
                System.out.println(year % 100 == 0 ? year % 400 == 0 ? year + " " + month + " have 29 days... " : year + " " + month + " have 28 days... " : year % 4 == 0 ? year + " " + month + " have 29 days... " : year + " " + month + " have 28 days... ");
                break;

            default:
                System.out.println("enter valid month");
                break;
        }




    }
}
