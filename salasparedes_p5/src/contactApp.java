import java.util.InputMismatchException;
import java.util.Scanner;

public class contactApp {
    private static final Scanner scan = new Scanner(System.in);

    public contactApp() {
        contactListMenu();
    }

    private static void contactListMenu() {
        contactAppMenu();
    }

    private static void contactAppMenu() {
        contactListMenuPrint();
        int choice = 0;
        while (choice != 3) {
            try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        createContact();
                        break;
                    case 2:
                        loadContact();
                        break;
                    case 3:
                        System.out.println("PROGRAM IS CLOSING THE CONTACT MENU");
                        System.out.println("PROGRAM WILL RETURN YOU TO THE APPLICATION MENU\n");
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID THAT'S A LETTER!!!!");
                scan.nextLine();
            }
        }
    }

    private static void createContact() {
        contactList currentList = new contactList();
        System.out.println("New contact is being created");
        contactOperationMenu(currentList);
    }

    private static void contactOperationMenu(contactList currentList) {
        operationPrintMenu();
        int choice = 0;
        while (choice != 3) {
            try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        currentList.contactListDisplay();
                        break;
                    case 2:
                        addContact(currentList);
                        operationPrintMenu();
                        break;
                    case 3:
                        editContact(currentList);
                        operationPrintMenu();
                        break;
                    case 4:
                        removeContact(currentList);
                        operationPrintMenu();
                        break;
                    case 5:
                        saveContact(currentList);
                        operationPrintMenu();
                        break;
                    case 6:
                        System.out.println("PROGRAM IS CLOSING THE CONTACT MENU");
                        System.out.println("PROGRAM WILL RETURN YOU TO THE OPERATIONS MENU\n");
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID THAT'S A LETTER!!!!");
                scan.nextLine();
            }
        }
    }

    private static void addContact(contactList currentList) {
        scan.nextLine();
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Phone Number(xxx-xx-xxxx): ");
        String phoneNumber = scan.nextLine();
        System.out.print("Email Address (x@y.z): ");
        String email = scan.nextLine();
        currentList.addContact(firstName,lastName,phoneNumber,email);
    }

    private static void contactListMenuPrint() {
        System.out.println("Contact Menu\n" +
                "---------\n" +
                "\n" +
                "1) create a new list\n" +
                "2) load an existing list\n" +
                "3) quit\n");
    }

    private static void editContact(contactList currentList) {
        String first,last,number,email;
        int choice;

        if(currentList.size() < 1){
            System.out.println("INVALID LIST IS EMPTY");
            return;
        }

        currentList.contactListDisplay();
        System.out.print("\n\nWhich Contact will you edit?: ");
        choice = scan.nextInt();
        scan.nextLine();

        if(choice >= currentList.size()){
            System.out.println("WARNING: invalid Selection.");
            return;
        }

        System.out.print("Enter a new name for contact "+choice+": ");
        first = scan.nextLine();
        System.out.print("Enter a new last name for contact "+choice+": ");
        last = scan.nextLine();
        System.out.print("Enter a new phone number (xxx-xxx-xxxx) for contact "+choice+": ");
        number = scan.nextLine();
        System.out.print("Enter a new email address (x@y.z) for contact "+choice+": ");
        email = scan.nextLine();

        currentList.editContact(choice, first, last, number, email);
    }

    private static void removeContact(contactList currentList) {
        int choice;

        currentList.contactListDisplay();
        System.out.print("\n\nWhich contact will you remove?: ");
        choice = scan.nextInt();
        scan.nextLine();

        currentList.removeContact(choice);
    }

    private static void operationPrintMenu() {
        System.out.println("List Operation Menu\n" +
                "---------\n" +
                "\n" +
                "1) view the list\n" +
                "2) add an item\n" +
                "3) edit an item\n" +
                "4) remove an item\n" +
                "5) save the current list\n" +
                "6) quit to the main menu");
    }

    private static void loadContact() {



    }

    private static void saveContact(contactList currentList) {



    }
}


