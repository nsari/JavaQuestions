package Interview_question;

public class Q16_StrCountInStr {
    //2.Print true if the string "java" and "python" appear the same number of
    //times in the given string word.Ex:javajavajavpythonpythonpyt



    static boolean isCountSame(String str){//javapythonjava
        int countJava, countPython;
        countJava = countPython = 0;
        str = str.replace(" ", "").toLowerCase();
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equals("java"))
                countJava++;
            if(str.substring(i, i + 6).equals("python"))
                countPython++;
        }
       // if(str.endsWith("java"))
        //    countJava++;
        return countJava == countPython;
    }

    //2.way
	 public static boolean count(String str) {
        int counter1=0;
        int counter2=0;
        while(str.contains("java")){
            str=str.replace("java", "");
            counter1++;
        }
         while(str.contains("python")) {
            str=str.replace("python","");
            counter2++;}
        return counter1==counter2;

    }




    public static void main(String[] args) {
        System.out.println(isCountSame("javajavajavpythonpythonpyt"));
        System.out.println(count("javajavajavpythonpythonpyt"));

    }









}
