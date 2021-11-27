package Interview_question;

public class Q15_SandwichStr {
    /*
     *1.A sandwich is two pieces of bread with something in between. Print the string
     *that is between the first and last appearance of "bread" in the given string,
     *or return string "nothing" if there are not two pieces of bread.
     *EX: breadozkanbread --> ozkan, breadozkan --> nothing

     **/
    static String isSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        //System.out.println(str.lastIndexOf("bread"));
        return(first==last)? "nothing":str.substring(first+5,last);

    }


    public static void main(String[] args) {
        System.out.println(isSandwich("breadozkanbread"));
    }


}
