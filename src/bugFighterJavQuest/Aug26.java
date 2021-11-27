package bugFighterJavQuest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aug26 {
    public static void main(String[] args) {
        /**
         Q-22)
         Show on the console one word as it is, and next word as reversed
         EXAMPLE
         String = "SQL takes time to learn, but it is useful software."
         =SQL sekat time ot learn, tub it si useful erawtfos.
         */
//        String str= "SQL takes time to learn, but it is useful software.";
//        String [] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));
//
//        String rts = "";
//        String word = "";
//        String qwert="";
//
//
//        for(int i=0; i<arr.length; i++) {
//            if(i%2==0) {
//                rts=rts+" "+arr[i];
//            }else {
//                qwert= arr[i];
//
//                for(int j=qwert.length()-1; j>=0; j--) {
//
//                    word =word+qwert.charAt(j);
//                }
//                rts=rts+" "+word;
//                word="";
//            }
//        }
//        System.out.println(rts);
/*
        String str = "SQL takes time to learn, but it is useful software.";
        List<String> wordList = new ArrayList<>(Arrays.asList(str.split(" ")));
        String a = "";
        String m = "";
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            if (i % 2 == 1) {
                m = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    m = m + word.charAt(j);
                }
                a += " " + m;
            } else {
                a += " " + word;
            }
        }
        System.out.println(a);
*/

        /**
         Q-23)
         String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
         write a program to count "java"
         */

        String  str = "Java and Python are Programming languages.I use java for practices.What can I do sometimes with Java.";
        Scanner scn = new Scanner(System.in);
        System.out.println("Give me  a word");
        String word = scn.nextLine().toLowerCase();
//      String [] arrAtr= str.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        String [] arrAtr = str.toLowerCase().split(" ");

        int  count = 0;
        for(int i = 0; i <= arrAtr.length-1; i++){
//            if(arrAtr[i].equals(word)){
            if(arrAtr[i].contains(word)){
                count++;
            }


        }
        System.out.println("In your sentences you have "+ count + " "+ word);

        /**
         Q-24)
         String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
         How many times each word is used in the String.
         */
        String str1 ="Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java.";
        String arr [] = str1.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");

        List<String> newWord = new ArrayList<>();
        List <Integer> newCount= new ArrayList<>();


        for(int i = 0; i < arr.length; i++){

            if(!newWord.contains(arr[i])) {

                int  count1 = 0;

                for(int j = 0; j<arr.length; j++) {

                    if(arr[i].equals(arr[j])) {

                        count1++;

                    }

                }
                newWord.add(arr[i]);
                newCount.add(count1);
                //System.out.println(arr[i] + " " +count+ " ");

            }

        }

        for(int i =0; i<newWord.size();i++) {
            System.out.println(newWord.get(i) +  " : " + newCount.get(i));

        }





    }
}
