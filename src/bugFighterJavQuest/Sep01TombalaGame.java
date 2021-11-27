package bugFighterJavQuest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sep01TombalaGame {
    public static void main(String[] args) {
        /**
         Create a tombala game
         numbers are 1-99
         when number is produced remove it, it should not be displayed again on the screen
         */
        Scanner scan = new Scanner(System.in);

        List<Integer> tombala = new ArrayList<>();

        for(int i = 1; i<=99; i++){
            tombala.add(i);
        }

        char option;

        do {
            int indexNo= (int)(Math.random()* tombala.size());
            System.err.println("The Number : "+tombala.get(indexNo));
            tombala.remove(indexNo);
            System.out.println("another number 'Y' --- Exit 'N'  --- Remaining Number = " + tombala.size());
            option = scan.next().charAt(0);
        }while(option!='N');




        System.out.println(tombala);

    }
}