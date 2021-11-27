package bugFighterJavQuest;


        import java.awt.*;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
class CarkiFelek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String harf;
        int point=0;
        int count=0;


        list.add("samsung");
        list.add("pasta");
        list.add("tiger");
        list.add("house");
        list.add("computer");
        list.add("america");
        list.add("huseyin");
        list.add("wonderland");
        list.add("turkiye");

        System.out.println("While playing the game you can select an option and hit enter key");
        System.out.println("'-' => to exit \n'+' => guess for extra point " );
        System.out.println("____________________________________\n \n");
        String word=list.get((int)(Math.random()*list.size()));
        System.out.println("The word is " + word.length() + " letters: " );
        List <String> list2 =new ArrayList<>(Arrays.asList(word.split("")));
        List <String> answer =new ArrayList<>();
        List <String> error =new ArrayList<>();
        int enjoy=500/word.length();

        for(int i=0; i<list2.size();i++) {

            answer.add("-");
        }

        System.out.println(answer);
        do {

            harf = ""+scan.next().toLowerCase().charAt(0);
            if(harf.equals("+")) {
                System.out.print("Enter your word trial :");
                String deneme=scan.next().toLowerCase();
                if(word.equals(deneme)) {
                    point+=225;
                    System.err.println("\nCongratualations");
                    count++;
                    break;
                }else {
                    System.out.print("it is wrong - 200 points \n Enter new character : ");
                    point-=200;
                    count++;
                    continue;
                }
            }
            if(list2.contains(harf)) {
                if(list2.indexOf(harf)!=list2.lastIndexOf(harf)){
                    if(answer.contains(harf)) {
                        System.out.print(harf + " is already tried. Enter another letter : ");
                        continue;
                    }
                    point+=enjoy*2;
                    answer.set(list2.indexOf(harf), harf);
                    answer.set(list2.lastIndexOf(harf), harf);
                    Toolkit.getDefaultToolkit().beep();
                    count++;
                }else {
                    if(answer.contains(harf)) {
                        System.out.print(harf + " is already tried. Enter another letter : ");
                        continue;
                    }
                    point+=enjoy;
                    answer.set(list2.indexOf(harf), harf);
                    Toolkit.getDefaultToolkit().beep();
                    count++;
                }
            }else {
                if(error.contains(harf)){
                    System.out.print(harf + " is already tried. Enter another letter : ");
                    continue;
                }

                error.add(harf);
                point-=enjoy/4;
                count++;

            }
            if(harf.equals("-")) {
                point =0;
                break;}
            System.err.println("Not available letters : " + error);
            System.out.println(answer);
        }while(!answer.equals(list2));
        System.out.println();
        System.out.println("You tried : " + count+" times");
        System.out.println("Thank you for playing the game");
        System.out.println("Your point is = " + point);



    }
}

