package bugFighterJavQuest;


    import java.util.ArrayList;
        import java.util.List;

class Sep02RandomNameGenerator {
    public static void main(String[] args) {
        /**
         Ask user to enter names one by one
         Create a program that picks name randomly later
         delete name after picking
         */



        List<String> list=new ArrayList<>();

        System.out.println("Please enter a name: ");
        System.out.println("To stop , press the button Q");
        do {

            list.add(MathHelp.askStringToUser());

        }while(!list.contains("Q"));
        list.remove("Q");

        String exit;
        do {
            int index=(int)(Math.random()*list.size());
            System.out.println(list.get(index));
            list.remove(index);
            System.out.println("Do you want to produce another name? to exit N " );
            exit=MathHelp.askStringToUser();

            if(exit.equals("N"))
                break;

        }while(list.size()>0) ;

        System.out.println("Thank you");
    }
}
