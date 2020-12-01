import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        applicationMenu();
    }

    static void applicationMenu() {
        int choice = 0;

        applicationMenuPrint();

            while (choice != 3) {
                try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        taskListMenu();
                        applicationMenuPrint();
                        break;
                    case 2:
                        contactApp currentContact = new contactApp();
                        applicationMenuPrint();
                        break;
                    case 3:
                        System.out.println("THANKS FOR PLAYING GOODBYE!");
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
                }catch (InputMismatchException e){
                    System.out.println("INVALID THAT'S A LETTER!!!!");
                    scan.nextLine();
                }
            }
    }

    private static void taskListMenu(){

    }

    private static void applicationMenuPrint() {
        System.out.print("Select Your Application\n" +
                "-----------------------\n" +
                "1) task list\n" +
                "2) contact list\n" +
                "3) quit\n" + "\n" +">");
    }
}
