import java.util.*;
public class App {
    public static void main(String[] args){
        mainMenu();
    }
    static void mainMenu() {
        int choice = 0;
        System.out.println(" Main Menu");
        System.out.println("-----------");
        System.out.print(
                "1) create a new list\n" +
                "2) load an existing list\n" +
                "3) quit\n\n> "
        );
        try {
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1 -> TaskList.Tasklist();
                case 2 -> System.out.println("ENTERED TWO");
                case 3 -> System.out.println(
                        "THANKS FOR PLAYING\n" +
                                "PROGRAM IS CLOSING"
                );
                default -> {
                    System.out.println("INVALID OPTION TRY AGAIN!\n");
                    mainMenu();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID YOU MUST ENTER AN INTEGER FROM 1-3\n");
            mainMenu();
        }
    }
}