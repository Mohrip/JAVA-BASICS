package Training.smallApps.expenseTracker;
import java.util.Scanner;

public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static ExpenseTracker expenseTracker = new ExpenseTracker();


    public static void main(String[] args) {
        while (true) {
            System.out.println("Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. Remove Expense");
            System.out.println("3. View Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addExpenses();
                    break;
                case 2:
                    removeExpense();
                    break;
                case 3:
                    viewExpenses();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addExpenses() {
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        




    }

    private static void removeExpense() {
        System.out.print("Enter ID of the expense to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        expenseTracker.removeExpenses(id);
        System.out.println("Expense removed successfully!");
    }

    private static void viewExpenses() {
        System.out.println("--- All Expenses ---");
        if (expenseTracker.getExpenses().isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            for (Expenses expense : expenseTracker.getExpenses()) {
                System.out.println(expense.toString());
            }
        }
        System.out.println("--------------------");
    }

}
