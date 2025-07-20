package Training.smallApps.taskApp;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TaskManager taskManager = new TaskManager();


    public static void main(String[] args) {
        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Update Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    viewTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task category (WORK, PERSONAL, SCHOOL, HEALTH, FINANCE, OTHER): ");
        String categoryInput = scanner.nextLine();
        Category category = Category.valueOf(categoryInput);

        Task task = new Task(taskManager.getNextId(), description, category);
        taskManager.addTask(task);
        System.out.println("Task added successfully.");
    }




    private static void removeTask() {
        System.out.print("Enter task ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        taskManager.removeTask(id);
        System.out.println("Task removed successfully.");
    }
    private static void updateTask() {
        System.out.print("Enter task ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter new task category (WORK, PERSONAL, SCHOOL, HEALTH, FINANCE, OTHER): ");
        String categoryInput = scanner.nextLine();
        Category category = Category.valueOf(categoryInput);

        System.out.print("Is the task completed? (true/false): ");
        boolean isCompleted = scanner.nextBoolean();
        scanner.nextLine();

        taskManager.updateTask(id, description, category, isCompleted);
        System.out.println("Task updated successfully.");
    }
    private static void viewTasks() {
        System.out.println("Current Tasks:");
        for (Task task : taskManager.getTasks()) {
            System.out.println(task);
        }
    }
}
