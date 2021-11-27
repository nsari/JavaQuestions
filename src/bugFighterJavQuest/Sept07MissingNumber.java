package bugFighterJavQuest;

import java.util.Arrays;

public class Sept07MissingNumber {
    public static void main(String[] args) {
        // arr{1,2,30,5,6,8,9,12,13,14,17,19,20,10,22,11,24,25,16,26,28,29,4}
//Find missing numbers. (Numbers are from 1 to 30). use only arrays

        int arr1[] = {1,2,30,5,6,8,9,12,13,14,17,19,20,10,22,11,24,25,16,26,28,29,4};
        int arr2[] = new int [30];


        for(int i=1;i<=30; i++) {
            arr2[i-1]=i;
        }

        Arrays.sort(arr1);

        for(int j =0; j<arr2.length;j++) {
            if(Arrays.binarySearch(arr1, arr2[j])<0) {
                System.out.print(j+1 + ", ");

            }
        }

        // arr{1,2,30,5,6,8,9,12,13,14,17,19,20,10,22,11,24,25,16,26,28,29,4}
        //Find missing numbers. (Numbers are from 1 to 30). use only arrays
//        int [] arr={1,2,30,5,6,8,9,12,13,14,17,19,20,10,22,11,24,25,16,26,28,29,4};
//                     //[1, 2, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 20, 22, 24, 25, 26, 28, 29, 30]
//        int [] arrPerfect={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int i=0;
//        int j=0;
//        while(i<arrPerfect.length && j<arr.length){
//            if(arr[j]!=arrPerfect[i]){
//                System.out.print(arrPerfect[i]+" ");
//                j--;
//            }
//            i++;
//            j++;
//        }

    }
}

