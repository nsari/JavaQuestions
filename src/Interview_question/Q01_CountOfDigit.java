package Interview_question;

import java.util.Scanner;

public class Q01_CountOfDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a large number to find the number of digits:");
        int num = scan.nextInt();

        int count =0;
        while(num!=0){
            num = num/10;
            count++;

        }
        System.out.println(count);

    }
}
