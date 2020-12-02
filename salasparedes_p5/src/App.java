import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        applicationMenu();
    }

    static int applicationMenu() {
        int choice = 0;

        applicationMenuPrint();

            while (choice != 3) {
                try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        TaskApp currentTask = new TaskApp();
                        applicationMenuPrint();
                        break;
                    case 2:
                        ContactApp currentContact = new ContactApp();
                        applicationMenuPrint();
                        break;
                    case 3:
                        System.out.println("THANKS FOR PLAYING GOODBYE!");
                        return 0;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
                }catch (InputMismatchException e){
                    System.out.println("INVALID THAT'S A LETTER!!!!");
                    applicationMenuPrint();
                    scan.nextLine();
                }
            }
        return choice;
    }

    private static void applicationMenuPrint() {
        System.out.print("Select Your Application\n" +
                "-----------------------\n" +
                "1) task list\n" +
                "2) contact list\n" +
                "3) quit\n" + "\n" +">");
    }
}
