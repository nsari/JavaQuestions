package Interview_question;

public class Q19_ArmstrongNumber {
//5. Write a method that collects the all positive Armstrong numbers up to
    //the number that is passed in. Armstrong is a number that is equal to the
    //sum of its own digits and each digit being raised to the power of the number
    //of digits. EX: 371 = 3^3 + 7^3 + 1^3 => 371

    static int numOfDigits(int num){
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }


    static boolean isArmstrong(int num){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int each = Integer.parseInt(str.substring(i, i + 1));
            sum += Math.pow(each, numOfDigits(num));
           if( sum == num)
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(numOfDigits(1535)));
    }

}
