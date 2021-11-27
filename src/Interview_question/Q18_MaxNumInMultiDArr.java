package Interview_question;

import java.util.Arrays;

import static Interview_question.Q17_CreateRandomMultiDArr.ArrayGenerator;

public class Q18_MaxNumInMultiDArr {
   //4.Given a 2d array of ints, find the biggest number(int) in
    //the array and print it.



    static int findMax(int[][] arr) {
       int max = Integer.MIN_VALUE;
       for(int[] eachArr:arr) {
           for(int num: eachArr) {
               if(num>max)
                   max=num;
           }
       }
       System.out.println(Arrays.deepToString(arr));
       return max;
   }

    public static void main(String[] args) {
        int brr[][]={{10, 6, 19, 12}, {5, 0, 3, 17}, {14, 17, 8, 16}, {5, 6, 12, 13}};
        System.out.println(findMax(brr));
        System.out.println(findMax(ArrayGenerator(3,4)));
    }

}
