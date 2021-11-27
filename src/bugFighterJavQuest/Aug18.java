package bugFighterJavQuest;

import java.util.Scanner;

public class Aug18 {

    public static void main(String[] args) {
        /**
         Q16 - Create a menu, and show the menu to user. Ask user to choose from the menu,
         and ask user to enter a number to process in the options according to conditions.
         if a user enter 1,or 2 or ,3 or,4 => program proceed the followings. use switch
         MENU----------------------
         1 - Calculate factor of an integer
         number should be entered from 2 to 10, if not ask user to enter again
         print factor
         abdurrahman, sukriye
         2 - reverse a number
         number should be bigger than 100, if not ask user again
         reverse number print
         huseyin, bilal
         3 - add each element of the number
         number should be bigger than 100, if not ask user again
         123 = 1 + 2 + 3 = 6
         esra, nuray
         4 - count up to 100
         number should be less than 100, if not ask user again
         mustafa, *sedef
         */
        Scanner scanner = new Scanner(System.in);
        int num ;//int num=0;
        do {
            System.out.println("Select a number from this list. \n1 - factoriyel\n2 - reverse\n3- add elements \n4 - count");
            num=scanner.nextInt();//num= getNumber();
        }while(num<0 || num > 4);

        switch (num) {
            case 1:

                do {

                    System.out.println("Please enter a natural number between 2 and 11 ");
                    num=getNumber();

                }while(num<=2 || num>=11) ;


                int fact=1;
               if(num<=2&&num>=11){
                    for(int i=1; i<=num; i++) {
                        fact=fact*i;
                    }
                    System.out.println(num+"!="+fact);


                }else {
                    System.out.println("Your number is not in this range. Please enter a a valid number");
                }

                break;

            case 2:


                System.out.println("Please enter number bigger than 100");

                do {

                    num = getNumber();

                    System.out.print(num<100?" Enter bigger than 100 \n number : ":"");
                } while(num<100);


                String s=String.valueOf(num);
                /*
                StringBuilder input1 = new StringBuilder(s);
                StringBuilder rvsstr = input1.reverse();
                System.out.println(rvsstr);
                 */

                String reverse="";

                for (int i=s.length()-1; i>=0;i-- ) {
                    reverse += s.charAt(i);
                }

                System.out.println(reverse);

                break;

            case 3:

                do {

                    System.out.println("Please give a number higher than 100");
                    num = getNumber();
                } while (num < 100);

                String str = String.valueOf(num);//int to String for used in for loop

                int sum=0;
                for(int i = 0; i < str.length(); i++) {
                    sum +=Integer.parseInt(String.valueOf(str.charAt(i)));//Str to int to get result
                }
                System.out.println(sum);
                break;


            case 4:

                do {

                    System.out.println("Enter number for counting (less than 100)");
                    num = getNumber();
                    System.out.println(num>=100?"invalid number, enter again":"");

                }while(num>=100);


                for (int i = num ; i <101 ; i++ ) {

                    System.out.print(" " + i);


                }

                break;

        }

    }
    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        int apple = scanner.nextInt();


        return apple;
    }
}
