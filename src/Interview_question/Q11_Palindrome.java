package Interview_question;

public class Q11_Palindrome {


    // Write a method that checks if word is palindrome. A palindrome
    // is a word, number, phrase, or other sequence of characters which
    // reads the same backward as forward, such as madam or racecar or the number 10801.


    static boolean isPalindrome(String str) {
        //1st Logic:

        for (int i = 0, j = 1; i < str.length() / 2; i++, j++) {
            if (str.charAt(i) != str.charAt(str.length() - j))
                return false;
        }
        return true;
    }
      // 2nd Logic:
 static boolean isReverse(String str) {
     String reversedString = "";
     for (int i = str.length() - 1; i >= 0; i--) {
         reversedString += str.charAt(i);
     }

     if (reversedString.equals(str)) {

         return true;
     }
     return false;

 }
    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isReverse("Ayse"));

    }

}