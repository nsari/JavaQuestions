package Interview_question;

import java.util.Scanner;

public class Q03_SumOfConseNum {
    public static void main(String[] args) {

        System.out.println(sumOfNumbers(5));


        //1.way Ask to user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to find the reverse");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int temp = 0;
        if (num2 < num1) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        int sum = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

        }
    }


    //2.way Assign the number use with method

    static int sumOfNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;//sum = sum+i
        }
        return sum;

    }

}




