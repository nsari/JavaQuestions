package Interview_question;

public class Q14_SumOfNumArr {
    //   12. Write a method that accepts an array and returns true if the sum of all
    //        3's in the array is exactly 9.
    //        EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false

    static boolean sumOf9(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int num : arr)
            if (num == 3) {
                count++;
                sum += num;
            }

        return sum == 9;


    }

    public static void main(String[] args) {


        System.out.println(sumOf9( new int[]{2, 3, 5, 3, 6, 3, 7}));


    }
}