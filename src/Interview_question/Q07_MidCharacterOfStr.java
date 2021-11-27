package Interview_question;

import java.util.Scanner;

public class Q07_MidCharacterOfStr {

    //Find middle character from a string that get from user

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();

        if(word.length()%2!=0 && word.length()>=3){
            System.out.println( word.substring(word.length()/2,word.length()/2+1));
        }else{
            System.out.println("it has not middle character");
        }




    }
}
