package Interview_question;

import java.util.Scanner;

public class Q04_SumOfDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter a number to find the sum of digits:");
        int num = scan.nextInt();

        int sum =0;
        while(num!=0){
            sum = sum + num%10;
            num=num/10;
        }
        System.out.println(sum);

    }
}
