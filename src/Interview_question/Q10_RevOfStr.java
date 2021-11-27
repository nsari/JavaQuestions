package Interview_question;

public class Q10_RevOfStr {

    // Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj

    static String isReverse(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversedString += str.charAt(i);
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(isReverse("racecar"));

        System.out.println("******");

        String str1 ="Ozkan";//scp
        String str2 = new String("Ozkan");//heap
        System.out.println(str1==str2);	//false
        System.out.println(str1.equals(str2));	//true

        String str3 = str1; // str3=Dallas
        System.out.println(str3==str1);//true

        str1= "Austin";
        System.out.println(str3==str1);//false
        System.out.println(str1.equals(str3));//false
        //equals() compares the objects.equals() is already overridden for string, Collection,
        //	Wrapper	classes for content comparison

    }








}