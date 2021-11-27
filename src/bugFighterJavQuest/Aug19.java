package bugFighterJavQuest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aug19 {

    public static void main(String[] args) {
        /**
         Q-17
         remove duplicated characters from the String that is entered by user
         example : bananas ==> bans
         create a String method, and return type is String, and call the String method in the main method.
         */
        List<Character> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String");
        String str = scan.next().toLowerCase();

        String abc ="";


        for(int i=0; i<str.length(); i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }


        }
        System.out.println(list);

    }
}
