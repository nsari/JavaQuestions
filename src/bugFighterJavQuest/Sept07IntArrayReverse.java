package bugFighterJavQuest;


import java.util.Arrays;

public class Sept07IntArrayReverse {
    public static void main(String[] args) {
        /**
         *   1. reverse array element without using another array.
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int middle = arr.length / 2;

        int temp;
        int j = arr.length - 1;

        for (int i = 0; i < middle; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

        System.out.println(Arrays.toString(arr));

    }
}