import java.io.*;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        mainMenu();
    }
    private static void mainMenu(){
        Scanner scan = new Scanner(System.in);
        mainMenuPrints();

        int choice = 0;

        while (choice != 3) {
            try {
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        CreateNewListMenu(scan);
                        mainMenuPrints();
                        break;
                    case 2:
                        loadExistingList(scan);
                        mainMenuPrints();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE");
                        System.out.print(">");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO!! THAT'S A LETTER YOU DINGUS");
                scan.nextLine();
            }
        }
    }

    private static void loadExistingList(Scanner scan) {
        System.out.print("Enter the filename to load: ");
        scan.nextLine();
        String fileWasMade = System.getProperty("user.dir") + "\\" + scan.nextLine();
        String s;

        TaskList taskList = new TaskList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileWasMade));
            while ((s = br.readLine()) != null) {
                String[] values = s.split(",");
                taskList.AddTask(new TaskItem(values[0], values[1], values[2], Boolean.parseBoolean(values[3])));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("INVALID WHAT ARE YOU DOING FILE WAS NOT LOADED");
        } catch (Exception e) {
            System.out.println("ERROR ERROR WHAT ARE YOU DOING LOAD WAS UNSUCCESSFUL");
        }

        System.out.println("LOADING TASK\n");

        listTaskMenu(scan, taskList);
    }

    private static void CreateNewListMenu(Scanner scan) {
        TaskList taskList = new TaskList();
        System.out.println("new task list has been created\n");
        listTaskMenu(scan, taskList);
    }

    private static void listTaskMenu(Scanner scan, TaskList taskList) {
        printTaskListMenu();
        int choice = 0;

        while (choice != 8) {

            try {
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        viewTaskList(taskList);
                        printTaskListMenu();
                        break;
                    case 2:
                        addItemToList(scan, taskList);
                        printTaskListMenu();
                        break;
                    case 3:
                        editItem(scan, taskList);
                        printTaskListMenu();
                        break;
                    case 4:
                        removeItem(scan, taskList);
                        printTaskListMenu();
                        break;
                    case 5:
                        markItemComplete(scan, taskList, true);
                        printTaskListMenu();
                        break;
                    case 6:
                        markItemComplete(scan, taskList, false);
                        printTaskListMenu();
                        break;
                    case 7:
                        saveListToTxtFile(scan, taskList);
                        printTaskListMenu();
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("INVALID THAT'S NOT A CHOICE CHIEF");
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID THAT'S A LETTER DUMBASS\n");
                scan.nextLine();
                printTaskListMenu();
            }
        }
    }

    private static void saveListToTxtFile(Scanner scan, TaskList taskList) {
        System.out.print("Enter a file name: ");
        scan.nextLine();
        String fileName = System.getProperty("user.dir") + "\\" + scan.nextLine();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for(TaskItem ti : taskList.GetTaskItems()) {
                writer.write(ti.getTitle() + "," + ti.getDescription() + "," + ti.getDueDate() + "," + ti.isCompleted() + "\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("INVALID FORMAT THE SAVE HAS BEEN ABORTED");
            return;
        }

        System.out.println("The task list has been saved \n");
        System.out.println("PROGRAM WILL BE SENDING YOU TO THE TASK MENU\n");

    }

    private static void markItemComplete(Scanner scan, TaskList taskList, boolean b) {
        System.out.print("\n");
        int choice = 0;

        if(b) {
            System.out.println("Uncompleted Tasks");
        } else {
            System.out.println("Completed Tasks");
        }

        System.out.println("-----------------");

        for (int i = 0; i < taskList.GetTaskItems(!b).size(); i++) {
            System.out.println(i + ") " + taskList.GetTaskItems(!b).get(i).toString());
        }

        System.out.print("\n");

        if (b) {
            System.out.print("Which task will you mark as completed? ");
        } else {
            System.out.print("Which task will you unmark as incomplete? ");
        }

        try {
            choice = scan.nextInt();
            taskList.GetTaskItems().get(choice).SetCompleted(b);
            System.out.print("\n");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("INVALID THAT'S NOT A TASK THAT EXISTS\n");
            System.out.println("PROGRAM WILL BE SENDING YOU TO THE TASK MENU\n");
        }
    }

    private static void removeItem(Scanner scan, TaskList taskList) {
        viewTaskList(taskList);

        System.out.print("Which task would you like to remove? ");
        try{
            int choice = scan.nextInt();
            taskList.RemoveTask(choice);
            System.out.print("\n");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("INVALID THAT'S NOT A TASK THAT EXISTS\n");
            System.out.println("PROGRAM WILL BE SENDING YOU TO THE TASK MENU\n");
        }
    }

    private static void editItem(Scanner scan, TaskList taskList) {
        viewTaskList(taskList);

        System.out.print("Which task would you like to edit? ");
        try {
            int choice = scan.nextInt();
            taskList.GetTaskItems().get(choice);
            scan.nextLine();

            System.out.print("Task title:  " + choice + ": ");
            String newTitle = scan.nextLine();

            System.out.print("Task description: " + choice + ": ");
            String newDescription = scan.nextLine();

            System.out.print("Task due date (YYYY-MM-DD): " + choice + ": ");
            String newDueDate = scan.nextLine();

            taskList.GetTaskItems().get(choice).SetTitle(newTitle);
            taskList.GetTaskItems().get(choice).SetDescription(newDescription);
            taskList.GetTaskItems().get(choice).SetDueDate(newDueDate);
        } catch (IllegalArgumentException titleException) {
            System.out.println("NO!!!! INVALID THE TASK MUST BE AT LEAST ONE CHARACTER. TASK WAS NOT EDITED");
        } catch (DateTimeParseException dueDateException) {
            System.out.println("INVALID THE DATE IS WRONG PROGRAM WILL TAKE YOU BACK TO THE TASK MENU: TASK WASN'T CREATED");
        } catch (IndexOutOfBoundsException indexException) {
            System.out.println("INVALID THAT'S NOT A TASK THAT EXISTS\n");
        }
    }

    private static void addItemToList(Scanner scan, TaskList taskList) {
        try {
            TaskItem taskItem;
            scan.nextLine();

            System.out.print("Task title: ");
            String title = scan.nextLine();

            System.out.print("Task description: ");
            String description = scan.nextLine();

            System.out.print("Task due date (YYYY-MM-DD): ");
            String dueDate = scan.nextLine();

            taskItem = new TaskItem(title, description, dueDate);
            taskList.AddTask(taskItem);
        } catch (IllegalArgumentException titleException) {
            System.out.println("INVALID THE TITLE CAN'T BE LESS THAN ONE CHARACTER IDIOT"
             + "TASK WASN'T CREATED TASK MENU WILL OPEN SOON\n"
            );
        } catch (DateTimeParseException dueDateException) {
            System.out.println("INVALID THE DATE IS WRONG PROGRAM WILL TAKE YOU BACK TO THE TASK MENU: TASK WASN'T CREATED");
        }
    }

    private static void viewTaskList(TaskList taskList) {
        System.out.println("Current tasks");
        System.out.println("-------------");

        for (int i = 0; i < taskList.GetTaskItems().size(); i++) {
            System.out.println(i + ") " + taskList.GetTaskItems().get(i).toString());
        }

    }

    private static void printTaskListMenu() {
        System.out.println("List Operation Menu\n" +
                "---------\n" +
                "\n" +
                "1) view the list\n" +
                "2) add an item\n" +
                "3) edit an item\n" +
                "4) remove an item\n" +
                "5) mark an item as completed\n" +
                "6) unmark an item as completed\n" +
                "7) save the current list\n" +
                "8) quit to the main menu\n");
        System.out.print(">");

    }

    private static void mainMenuPrints() {
        System.out.println("Main Menu\n" +
                "---------\n" +
                "1) create a new list\n" +
                "2) load an existing list\n" +
                "3) quit\n");
        System.out.print(">");
    }
}