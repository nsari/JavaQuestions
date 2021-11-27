package bugFighterJavQuest;

import java.util.Scanner;

public class Aug25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//------------------------------------------------------------------------------------
        /**
         Q-22
         Ask use to enter firstname and lastname under given conditions;
         1)If user uses space characters at the beginning or at the end remove them.
         2)If user enters nothing or just space character, give a message like
         "Just space characters or nothing is not valid"
         3)If user does not use space character between first and last name
         give a message like "One of the lastname and first name is not entered
         or space is not used between firstname and lastname"
         4)If user uses multiple space characters between firstname and lastname
         make it single
         5)Initials of firstname and lastname should be uppercase,
         other characters should be lowercases.
         If user does not enter the name in this format fix it.
         */


//        System.out.println("Enter your firstname and your lastname");
//
//        String fullName = scan.nextLine();
//      //SECTION 1
//        fullName = fullName.trim();
//
//
//     //SECTION 2
//        if (fullName.isBlank()) {
//            System.out.println("Just space characters or nothing is not valid");
//        }
//
//    //SECTION 3
//        if (!fullName.contains(" ")) {
//            System.out.println("One of the lastname and first name is not entered  or space is not used between firstname and lastname");
//        }
//
//        //4........
//        fullName = fullName.substring(0, fullName.indexOf(" "))+fullName.substring(fullName.lastIndexOf(" "));
//
//        //.replace()/....
////	 		System.out.println(fullName.replaceAll("\\s", ""));   /// --> selen*************ucar
//
//
//        // SECTION 5
//       fullName=fullName.substring(0,1).toUpperCase()+fullName.substring(1,fullName.indexOf(" ")).toLowerCase()
//               + fullName.substring(fullName.indexOf(" "),fullName.indexOf(" ")+2).toUpperCase()+fullName.substring(fullName.indexOf(" ")+2).toLowerCase();
//
//
//        System.out.println(fullName);

        //------------------------------------------------------------------------------------
        /**
         Q-21
         Ask user to enter a password
         If the password  is "Apple1234" show user secret message as "Mission Complete- Find Spider-Man and punish him"
         If the password is wrong reverse the password in the system to make user to find it harder. Print on the console
         "The password is wrong, and changed"
         To see what is the new password print it.
         */
        System.out.println(" Give me a number");

        String password = scan.nextLine();

        String given = "Apple1234";
        String reversegiven = "";

        if(password.equals("Apple1234")){
            System.out.println("Mission Complete- Find Spider-Man and punish him");

        }else {
            for(int i = given.length()-1; i>= 0 ; i--) {

                reversegiven+= given.charAt(i);
            }
            System.out.println("Password is wrong and change!! Misssion completeee");
        }
        given = reversegiven;
        System.out.println(given);



//    isPassword(scanner());
//
//}
//    public static String scanner() {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a password:");
//        String str=scan.next();
//
//        return str;
//
//    }
//
//
//    public static boolean isPassword(String str) {
//
//
//
//        if(str.equals("Apple1234")) {
//            System.out.println("Mission Complete- Find Spider-Man and punish him");
//        }else if (!str.equals("Apple1234")){
//
//            String pssw="Aplle1234";
//            StringBuilder sb=new StringBuilder(pssw);
//
//            sb=sb.reverse();
//            System.out.println(sb+ "  The password is wrong, and changed");
//        }
//        return false;
//
//
//    }







    }
}
