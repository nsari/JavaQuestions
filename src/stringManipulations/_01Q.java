package stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class _01Q {
    public static void main(String[] args) {

        //Find middle character from a string that get from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word =scan.nextLine();

        if(word.length()%2!=0&&word.length()>=3){
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }else{
            System.out.println("it has even number of chars");
        }

//Ask to user first,last,and credit card number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your name");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Enter the your lastname");
        String lname = scanner.nextLine().toUpperCase();
        System.out.println("Enter the your credit card number");
        String num = scanner.nextLine();

        name = name.substring(0,1) + name.substring(1).replaceAll("\\w","*");
        lname =lname.substring(0,1) + lname.substring(1).replaceAll("\\w","*");
        System.out.println(name +" "+lname);
        if(num.length()==16) {
            num = num.substring(0, 11).replaceAll("\\w", "*")+num.substring(11);
            System.out.println(num);

        }else{
            System.out.println("Credit card number is invalid");
        }






    }
}
