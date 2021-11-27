package bugFighterJavQuest;

import java.util.*;

public class Aug13 {
    public static void main(String[] args) {
        /**
         * Q11-
         *  ask user to enter his blood group (only A, B, O or AB)
         *  if a user is AB blood group print on the console "You can get blood from A,B,O and AB"
         *  if a user is A blood group print on the console "You can receive blood from A and O"
         *  if a user is B blood group print on the console "You can receive blood from B and O"
         *  if a user is O blood group print on the console "Sorry, you can receive only O"
         */
//Solution 1
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your blood type");
        String blood = scan.next().toUpperCase();
        if (blood.equals("AB")) {
            System.out.println("You can get blood from A,B,O and AB");
        } else if (blood.equals("A")) {
            System.out.println("You can receive blood from A and O");
        } else if (blood.equals("B")) {
            System.out.println("You can receive blood from B and O");
        } else if (blood.equals("O")) {
            System.out.println("Sorry, you can receive only O");
        } else {
            System.out.println("We need a real blood type");
        }


//Solution 2
        switch (blood) {
            case "AB":
                System.out.println("You can get blood from A,B,O and AB");
                break;
            case "A":
                System.out.println("You can get blood from A and O");
                break;
            case "B":
                System.out.println("You can get blood from B and O");
                break;
            case "O":
                System.out.println("Sorry, you can receive only O");
                break;

            default:
                System.err.println("we need a real blood type");
                break;
        }


//--------------------------------------------------------------------------------------------------------------
        /**
         * Q12-
         * Ask a user to enter his "name" and age.
         * Ask a user to enter how long he has been staying in USA "year only"
         *
         * if a user stays in USA less than 3 years print on the console "name, You are not eligible to apply Green Card"
         * if a user stays in USA more than 3 years proceed following conditions
         * {
         *      if a user is younger than 18, print on the console "name, Parent signature is required for application"
         *      if a user is older than 18, print on the screen " name, you are eligible to apply for Green Card TOEFL is required"
         *      if a user is older than 50, print on the screen "name, You are eligible to apply for Green card, and TOEFL is not required"
         * }
         */

        System.out.println("Please enter your full name");
        String name = scan.nextLine();
        System.out.println();
        int age;

        do {
            System.out.println(("Please enter your age"));
            age = scan.nextInt();
           //  age=Math.abs(age);  --for do while an alternative
            System.out.println(age < 0 ? "please enter positive value" : "");
        } while (age < 0);

        System.out.println("How long have you been in USA");
        int year = scan.nextInt();

        if (year < 3) {
            System.out.println("Mr/Mrs " + name + ", you are not eligible to apply Green Card ");
        } else {
            if (age < 18) {
                System.out.println("Mr/Mrs " + name + ", parent signature is required for application");
            } else if (age >= 18 && age < 50) {
                System.out.println("Mr/Mrs " + name + " , you are eligible to apply for Green Card TOEFL is required");

            } else {
                System.out.println("Mr/Mrs " + name + ", you are eligible to apply for Green card, and TOEFL is not required");
            }
        }


//-----------------------------------------------------------------------------------------------------------------------------------
        /**
         Q13 - registrationList {Abdrurrahman, Bilal, Hatice, Esen, Emrah, Huseyin, Olcay, Mustafa}
         Ask user to enter a name, and check if the name is in the registrationList
         if so, print "You are team 2 member, brighter future is very close"
         if not, print on the console "Contact with Team leader for registration"
         */
        List<String> registirationList =
                new ArrayList<>(Arrays.asList("Abdurrahman","Bilal","Hatice","Esen","Emrah","Huseyin","Olcay","Selen","Esra","Mustafa"));

//			List <String> registirationList =new ArrayList<>();
//			registirationList.add("Abdurrahman");
//			registirationList.add("Bilal");
//			registirationList.add("Hatice");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");

        String name1 = scanner.nextLine();


        if(registirationList.contains(name1)) {
            System.out.println("You are team 1 member, brighter future is very close");
        }else {
            System.out.println("Contact with Team leader for registration");
            registirationList.add(name1);

            System.out.println("You added Team 1");
        }
        Collections.sort(registirationList);
        System.out.println(registirationList);
    }
}


