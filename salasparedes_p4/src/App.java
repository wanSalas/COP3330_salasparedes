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
/*
    private static void createFunction() {
        System.out.println("new task list has been created\n");
        ArrayList<String> taskList = new ArrayList<>();
        fileMenu(taskList);

    }

    private static void fileMenu(ArrayList<String> taskList) {
        int choice = 0;
        System.out.println(" List Operation Menu");
        System.out.println("-----------");
        System.out.print(
                "1) View the list\n" +
                "2) add an item\n" +
                "3) edit an item\n" +
                "4) remove an item\n" +
                "5) mark an item as completed\n" +
                "6) unmark an item as completed\n" +
                "7) save the current list\n" +
                "8) quit to the main menu\n\n> "
        );
        try{
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int counter = 0;
                    System.out.println("Current Tasks");
                    System.out.println("-------------");
                    for (String ignored : taskList){
                        System.out.println(counter + ")" + taskList + "\n");
                        counter++;
                    }
                    fileMenu(taskList);
                    break;
                case 2:
                    addingFunction(taskList);
                    fileMenu(taskList);
                    break;
                case 3:
                    System.out.println("ENTERED THREE");
                    break;
                case 4:
                    System.out.println("ENTERED FOUR");
                    break;
                case 5:
                    System.out.println("ENTERED FIVE");
                    break;
                case 6:
                    System.out.println("ENTERED SIX");
                    break;
                case 7:
                    System.out.println("ENTERED SEVEN");
                    break;
                case 8:
                    mainMenu();
                    break;
                default:
                    System.out.println("INVALID CHOICE TRY AGAIN !!");
                    fileMenu(taskList);
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID YOU MUST ENTER AN INTEGER FROM 1-8\n");
            fileMenu(taskList);
        }
    }*/

    /*private static void addingFunction(ArrayList<String> taskList) {
        String taskName, taskDescription, taskDueDate, stringD ;
        System.out.print("Task title: ");
        Scanner input = new Scanner(System.in);
        taskName = input.nextLine();
        System.out.print("Task Description: ");
        Scanner secondInput = new Scanner(System.in);
        taskDescription = secondInput.nextLine();
        System.out.print("Task Due Date (YYYY-MM-DD): ");
        Scanner thirdInput = new Scanner(System.in);
        taskDueDate = thirdInput.nextLine();
        stringD = taskName + " " +  taskDescription + " " + taskDueDate;
        taskList.add(stringD);
    }*/

}