package bugFighterJavQuest;


import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class NamePicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list = addName(list);


        System.out.println("you can press character for operation "
                + "\n y : pick another name"
                + "\n + : add another name");
        char again;
        do {
            if (list.isEmpty()) {
                System.out.println("No name to show");
                break;
            }
            int i = (int) (Math.random() * list.size());
            System.err.println(list.get(i));
            list.remove(i);
            again = scan.next().charAt(0);
            if (again == '+') {
                addName(list);
                again = 'y';
            }
        } while (again == 'y');
        System.out.println("Thank you for using the name generator");
    }



    public static List<String> addName(List<String> list) {
        Scanner scan = new Scanner(System.in);

        String name;

        System.out.println("After adding name press 'y' to start picking name");
        do {
            System.out.print("Add name: ");
            name = scan.next().toLowerCase();
            list.add(name);
            list.remove("y");

        } while (!name.equals("y"));

        return list;

    }



}
