package bugFighterJavQuest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Sep08DateTime {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        int year = currentDate.getYear();
        System.out.println(year);
        //   System.out.println(currentDate.getHour());
        System.out.println(currentDate.getDayOfWeek());

        LocalDate dateOfBirth = LocalDate.of(1980,06,25);
        System.out.println(dateOfBirth);
        System.out.println(dateOfBirth.getDayOfWeek());

        Period age = Period.between(currentDate,dateOfBirth);
        System.out.println(Math.abs(age.getYears()));
        System.out.println(currentDate.isAfter(dateOfBirth));

        /**
         * Create a current date and time
         * We will create 5 different time zones
         * time zones are :
         *     panda (21 hours lag from current time zone)
         *              *Create a format as Day/Month/Year - 24 hours method
         *     monkey (10 hours lag from current time zone)
         *              *Create a format as Month/Day/Year - 12 hours method
         *     cat (is the current time zone)
         *              *Create a format as Month/Day/Year - 12 hours method
         *     snake (5 hours lead from the current time zone)
         *              *Create a format as Month/Day/Year - 24 hours method
         *     dragon (16 hours lead from the current time zone)
         *              *Create a format as Year/Month/Day - 24 hours method
         *     Ask user to pick time zone
         *     Ask user to enter country name
         *
         *     Print on the console current date for that time zone and name of the country is selected
         */


    }

    public static void panda(){

    }


}
