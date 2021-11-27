package bugFighterJavQuest;

import java.util.Scanner;

public class Aug12 {

    public static void main(String[] args) {
        /**
         Q10 - ask user to enter a name,
         print on the console how many characters are there
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println(name + " has "+ name.length() + " characters");

    }
}
