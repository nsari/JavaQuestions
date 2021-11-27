package Interview_question;

import java.util.Scanner;

public class Q08_CreditCNumNameStar {

    //Ask to user first,last,and credit card number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your name");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Enter the your lastname");
        String lname = scanner.nextLine().toUpperCase();
        System.out.println("Enter the your credit card number");
        String num = scanner.nextLine();

        name = name.substring(0,1) + name.substring(1).replaceAll("\\w","*");
        lname = lname.substring(0,1)+ lname.substring(1).replaceAll("\\w","*");
        System.out.println(name+" "+lname);

        if(num.length()==16){
            num=num.substring(0,11).replaceAll("\\w","*") +num.substring(11);
            System.out.println(num);
        }
        else{
            System.out.println("Credit card number is invalid");
        }






    }
}
