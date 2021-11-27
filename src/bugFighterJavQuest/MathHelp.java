package bugFighterJavQuest;

import java.util.Scanner;

public class MathHelp {

    public static String askStringToUser(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    public static void menu() {
        System.out.println();
        System.out.println("Select from the menu \n 1. Binary to Decimal \n 2. Decimal to Binary \n "
                + "3. Square Area Calculator \n 4. Number Sequence \n 5. miles to km Calculator \n" + "6. EXIT ");
        int m = Aug31MethodProgs.askIntToUser();
        switch (m) {
            case 1:
                binaryToDecimal();
                break;
            case 2:
                decimalToBinary();
                break;
            case 3:
                SquareCalc();
                break;
            case 4:
                numberSequence();
                break;
            case 5:
                milestokmCalculator();
                break;
            default:
                System.out.println("karisik duygular icindeyim");
        }
    }

    public static void binaryToDecimal() {
        System.out.println("Please enter a binary number");
        int binary = Aug31MethodProgs.askIntToUser();
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int dgt = binary % 10;
                decimal += (int) (dgt * Math.pow(2, n));
                binary = binary / 10;
                n++;
            }
        }
        System.out.println(decimal);
        menu();
    }

    public static void decimalToBinary() {
        System.out.println("Enter a decimal number to convert binary");
        int num = Aug31MethodProgs.askIntToUser();
        StringBuilder strB = new StringBuilder();
        do {

            strB.append(num % 2);
            num = num / 2;
        } while (num > 0);
        //strB.append(num);
        System.out.println(strB.reverse());
        menu();
    }

    public static void numberSequence() {

        System.out.println("Enter a sequence");

        int numer = Aug31MethodProgs.askIntToUser();

        for (int i = 0; i <= 100; i = i + numer) {

            System.out.print(" " + i);
        }
        menu();
    }

    public static void SquareCalc() {
        System.out.println("Please enter a number");
        int num = Aug31MethodProgs.askIntToUser();
        int area = num * num;
        System.out.println("Area is: " + area);
        menu();
    }

    public static void milestokmCalculator() {
        System.out.println("Please enter a mile to convert km");
        int mile = Aug31MethodProgs.askIntToUser();
        double km= mile*1.609;
        System.out.println(km);

        menu();
    }
}
