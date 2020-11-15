import java.util.*;
public class TaskList {

    public static void Tasklist() {
        TaskList test = new TaskList();
        makingList();
    }

    private static void listMenu(ArrayList<String> taskList) {
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
        try {
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int counter = 0;
                    System.out.println("Current Tasks");
                    System.out.println("-------------");
                    for(int i = 0; i < taskList.size();i++){
                        System.out.println(counter+ ")"+ taskList.get(i));
                        counter++;
                    }
                    listMenu(taskList);
                    break;
                case 2:
                    addingFunction(taskList);
                    listMenu(taskList);
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
                    App.mainMenu();
                    break;
                default:
                    System.out.println("INVALID CHOICE TRY AGAIN !!");
                    listMenu(taskList);
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID YOU MUST ENTER AN INTEGER FROM 1-8\n");
            listMenu(taskList);
        }
    }

    private static void addingFunction(ArrayList<String> taskList) {
        String taskName = "", taskDescription = "", taskDueDate = "";
        System.out.print("Task title: ");
        Scanner input = new Scanner(System.in);
        taskName = input.nextLine();
        System.out.print("Task Description: ");
        taskDescription = input.nextLine();
        System.out.print("Task Due Date (YYYY-MM-DD): ");
        taskDueDate = input.nextLine();
        taskList.add(taskName + " " +  taskDescription + " " + taskDueDate);
    }

    private static void makingList() {
        System.out.println("new task list has been created\n");
        ArrayList<String> taskList = new ArrayList<>();
        listMenu(taskList);
    }
}
