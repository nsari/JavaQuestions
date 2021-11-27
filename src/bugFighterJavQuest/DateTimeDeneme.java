package bugFighterJavQuest;

        import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.time.LocalDate;
        import java.time.Period;
        import java.util.Date;
        import java.util.Scanner;
        import java.util.logging.SimpleFormatter;

class DateTimeDeneme {
    public static void main(String[] args) throws ParseException {
        LocalDate currentDate1 = LocalDate.now();
        System.out.println(currentDate1);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Date of Your Birthday Day/Month/Year");
        String DOB = scan.next();
        System.out.println(DOB);



        Period age = Period.between(LocalDate.parse(DOB),currentDate1);
        System.out.println(age.getYears());
    }
}
