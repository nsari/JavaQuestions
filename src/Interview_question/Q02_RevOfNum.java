package Interview_question;

import java.util.Scanner;

public class Q02_RevOfNum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number to find the reverse");
        int num =scan.nextInt();

        int rev= 0;
        while(num!=0){
            rev = 10*rev+num%10;
            num = num/10;
        }
        System.out.println(rev);


    }
}
