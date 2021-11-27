package Interview_question;

public class Q12_ExtractsLetNum {

    // Write method that accepts a String and extracts letters and numbers.
    //Method should return a String.
    //EX: a1b2c3 --> Letters are abc and numbers are 123.


    static String extracter(String str) {

        String letters= "";
        String numbers= "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (Character.isLetter(eachLetter))
                letters += eachLetter;
            if (Character.isDigit(eachLetter))
                numbers += eachLetter;
        }


        return "Letters are   " + letters + " Numbers are  " + numbers;
    }

    public static void main(String[] args) {
        System.out.println(extracter("a12b3c"));
    }

}