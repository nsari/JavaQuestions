package stringManipulations;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
         * *Explanation about primeNumber,Prime numbers are numbers that have only 2 factors:
         * 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
         *  By contrast, numbers with more than 2 factors are call composite number.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        int dvd =1;

        for(int i =2 ; i<num ; i++){
            dvd = dvd*(num%i);
        }
        if(dvd == 0){
            System.out.println(num + " is a composite number");
        }else{
            System.out.println(num + " is a prime number");
        }








    }
}
