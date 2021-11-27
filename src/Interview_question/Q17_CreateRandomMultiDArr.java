package Interview_question;

import java.util.Arrays;
import java.util.Random;

public class Q17_CreateRandomMultiDArr {
   //3.create a two dimensional array of random numbers.


    static int[][] ArrayGenerator(int outerSize, int innerSize){
        int[][] arr = new int[outerSize][innerSize];
        for(int i = 0; i < outerSize; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = new Random().nextInt(20);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(ArrayGenerator(4,4)));
    }



}
