package it_society;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumSolution_01 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 26;

        sumsToTarget_BruteForce( arr, 26);
    }
//1.way
    private static boolean sumsToTarget_BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {

                   //return new int[]{i,j};
                    return true;
                }
            }
        }
        return false;

    }

  //2.way

  //11,2,7,15
  //target = 9
    //2,7,11,15


  private static boolean sumsToTarget_SortAndFind(int[]arr , int target) {
      //sort -ascending
      Arrays.sort(arr);//nlogn

      int left = 0;
      int right = arr.length - 1;

      while (left < right) {
          int sum = arr[left] + arr[right];
          if (sum == target) return true;
          else if (sum < target) {
              left++;
          } else {
              right--;
          }

      }
      return false;

      //3.way
/*
    private static boolean sumsToTarget_HashSet(Integer[]arr,){
      //coding to interfaces,not implementation rahatca diger interfacelere geceriz codu update ederiz
       //Time comp => o(n) - space comp=>

        Set<Integer> values = new HashSet<>();
          for (int i = 0; i < arr.length; i++){
              int lookFor = target - arr[i];
              if(values.contains(lookFor)){
                  return true;
              }
          values.add(arr[i]);
          }
         return false;

      }


*/
  }



}