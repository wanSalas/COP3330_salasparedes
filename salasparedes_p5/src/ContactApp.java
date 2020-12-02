import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactApp {
    private static final Scanner scan = new Scanner(System.in);

    public ContactApp() {
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
                contactListMenuPrint();
                scan.nextLine();
            }
        }
    }

    private static void createContact() {
        ContactList currentList = new ContactList();
        System.out.println("New contact is being created");
        contactOperationMenu(currentList);
    }

    private static void contactOperationMenu(ContactList currentList) {
        operationPrintMenu();
        int choice = 0;
        while (choice != 3) {
            try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        currentList.contactListDisplay();
                        operationPrintMenu();
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
                        System.out.println("PROGRAM WILL RETURN YOU TO THE APPLICATION MENU\n");
                        App.applicationMenu();
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID THAT'S A LETTER!!!!");
                operationPrintMenu();
                scan.nextLine();
            }
        }
    }

    private static void addContact(ContactList currentList) {
        scan.nextLine();
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Phone Number(xxx-xxx-xxxx): ");
        String phoneNumber = scan.nextLine();
        System.out.print("Email Address (x@y.z): ");
        String email = scan.nextLine();
        currentList.addContact(firstName, lastName, phoneNumber, email);
    }

    private static void contactListMenuPrint() {
        System.out.println("Contact Menu\n" +
                "---------\n" +
                "\n" +
                "1) create a new list\n" +
                "2) load an existing list\n" +
                "3) quit\n");
    }

    private static void editContact(ContactList currentList) {
        String first, last, number, email;
        int choice;

        if (currentList.size() < 1) {
            System.out.println("INVALID LIST IS EMPTY");
            return;
        }

        currentList.contactListDisplay();
        System.out.print("\n\nWhich Contact will you edit?: ");
        choice = scan.nextInt();
        scan.nextLine();

        if (choice >= currentList.size()) {
            System.out.println("WARNING: invalid Selection.");
            return;
        }

        System.out.print("Enter a new name for contact " + choice + ": ");
        first = scan.nextLine();
        System.out.print("Enter a new last name for contact " + choice + ": ");
        last = scan.nextLine();
        System.out.print("Enter a new phone number (xxx-xxx-xxxx) for contact " + choice + ": ");
        number = scan.nextLine();
        System.out.print("Enter a new email address (x@y.z) for contact " + choice + ": ");
        email = scan.nextLine();

        currentList.editContact(choice, first, last, number, email);
        contactOperationMenu(currentList);
    }

    private static void removeContact(ContactList currentList) {
        int choice;

        currentList.contactListDisplay();
        System.out.print("\n\nWhich contact will you remove?: ");
        choice = scan.nextInt();
        scan.nextLine();

        currentList.removeContact(choice);
        contactOperationMenu(currentList);
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
        String newFile;
        System.out.print("Enter the file name (.txt): ");
        newFile = scan.nextLine();
        try {
            File fin = new File(newFile);
            try (Scanner fileScanner = new Scanner(fin)) {
                ContactList savingList = new ContactList();
                while (fileScanner.hasNextLine())
                    savingList.addContact(fileScanner.nextLine(), fileScanner.nextLine(), fileScanner.nextLine(), fileScanner.nextLine());
                fileScanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("INVALID DOES NOT SAVE");
        }
    }

    private static void saveContact(ContactList currentList) {
        System.out.print("Enter a file name: ");
        scan.nextLine();
        String fileName = System.getProperty("user.dir") + "\\" + scan.nextLine();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for(ContactItem Ci : currentList.GetContactItem()) {
                writer.write(Ci.getFirstName() + "," + Ci.getLastname() + "," + Ci.getPhoneNumber() + "," + Ci.getEmail() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("INVALID FORMAT THE SAVE HAS BEEN ABORTED");
            return;
        }

        System.out.println("The task list has been saved \n");
        System.out.println("PROGRAM WILL BE SENDING YOU TO THE TASK MENU\n");
    }
}


