package Interview_question;

public class Q06_PatternOfNum {
    public static void main(String[] args) {

    /*
 *1
  22
  333
  4444
  55555
  666666
  7777777
  *write a program to create this pattern in java.
 */

   for(int i = 1 ; i<=7 ; i++){
       for(int j =1 ; j<=i ; j++){
           System.out.print(1);
          // System.out.print("*");
       }
       System.out.println();
   }





    }
}
