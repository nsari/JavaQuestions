package bugFighterJavQuest;

import java.util.Arrays;
import java.util.Scanner;

public class Aug31MethodProgs {

    /**
     *
     *   selen + mustafa      * Create a method to ask user for integer                                               ==>     askIntToUser()
     *   selen  +mustafa      * Create a method to ask user  array  numbers (10 numbers)                              ==>     askArrayToUser()
     *
     * Create a menu to call following methods and use askIntToUser() or askArrayToUser() if necessary
     *   bilal+ huseyin       1- Create a method to check if the number is palindrome                                  ==>     numberPalindrome()
     *  abdurrahman+esen      2- Create a method to check if the number is prime number                                ==>     numberPrime()
     *
     *  abdurrahman,esen        3- Create a method to sort an array (don't use sort) (from min to max)                   ==>     sortArray()
     *   bilal,sukriye, esra       4- Create a method to find the max and min number in the array  ( you can use sort)      ==>     findMaxMin()
     *    selen,huseyin,mustafa      5- Create a method to find sub array. ask array, starting and ending indexes and print array in between  ==> checkSubArray()
     *
     *
     */
    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        System.out.println();
        System.out.println("Select from the menu \n 1. Palindrome \n 2. Prime Number \n 3. Sort Array \n 4. Find Max and Min \n 5. Sub Array \n 6. Exit");
        int m = askIntToUser();
        switch (m){
            case 1:
                numberPalindrome();
                break;
            case 2:
                isPrimeNumber();
                break;
            case 3:
                sortArray();
                break;
            case 4:
                findMaxMin();
                break;
            case 5:
                checkSubArray();
                break;
            default:
                System.out.println("Thank you for using the app");
        }

    }


    public static int askIntToUser(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }

    public static int[] askArrayToUser(){
        System.out.println("Please enter numbers to make a list..");
        int arr[] = new int[10];
        for(int i=0; i<10;i++) {
            System.out.println("Number "+(i+1)+" :");
            arr[i]=askIntToUser();
        }
        return arr;
    }

    public static void numberPalindrome() {
        System.out.println("Enter a number to check palindrom or not");
        int x = askIntToUser();
        String str = Integer.toString(x);
        String strR = "";
        for(int i=str.length()-1; i>=0; i--)
            strR+=str.charAt(i);
        if(str.equals(strR))
            System.out.println(str+" is a palindrom");
        else
            System.out.println(str+" isn't a palindrom");
        menu();
    }

    public static void isPrimeNumber() {
        System.out.println("Enter a number if it is prime...");
        int number=askIntToUser();
        if(number>0) {
            int counter=0;
            for(int i=1; i<=number; i++) {
                if (number%i==0)
                    counter++;
            }
            if(counter==2)
                System.out.println(number+ " is prime");
            else
                System.out.println(number+ " is not prime");
        }else
            System.out.println(number+ " is not prime");

        menu();
    }


    public static void sortArray() {

        System.out.println("Not completed app ");
        menu();
    }

    public static void findMaxMin() {
        int arr[]= askArrayToUser();
        Arrays.sort(arr);
        System.out.println("min element is: "+arr[0]+"   max element is: "+arr[arr.length-1]);

//2. Way
        //        int a[] = {50, 35, 40, 60, 20, 30};
//        int minEl = a[0];
//        int maxEl = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < minEl) {
//                minEl = a[i];
//            }
//            if(a[i] > maxEl){
//                maxEl = a[i];
//            }
//        }
//        System.out.println("min: "+minEl+"    max: "+maxEl);


        //3. Way
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        int arr[] = askArrayToUser();
//
//        for(int w: arr) {
//            if(w>max)
//                max=w;
//            if(w<min)
//                min=w;
//        }
        //        System.out.println("min: "+min+" max: "+max);
        menu();
    }

    public static void checkSubArray(){
        System.out.println("Enter an array");
        int list[] = askArrayToUser();
        System.out.println("Enter starting index");
        int start = askIntToUser();
        System.out.println("Enter ending index");
        int end = askIntToUser();

        System.out.print("The numbers are : ");
        for(int i= start; i<end; i++) {
            System.out.print(list[i]+" ");
        }
        menu();
    }
}