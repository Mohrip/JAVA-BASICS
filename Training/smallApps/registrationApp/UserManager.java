package Training.smallApps.registrationApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void register() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter secret question:");
        String secretQuestion = scanner.nextLine();
        System.out.println("Enter secret answer:");
        String secretAnswer = scanner.nextLine();

        users.add(new User(username, password, secretQuestion, secretAnswer, email));
        System.out.println("User registered successfully!");
    }

    public void login() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }

    public void resetPassword() {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Answer your secret question: " + user.getUsername());
                String answer = scanner.nextLine();
                if (user.getSecretAnswer().equals(answer)) {
                    System.out.println("Enter new password:");
                    String newPassword = scanner.nextLine();
                    user.setPassword(newPassword);
                    System.out.println("Password reset successfully!");
                    return;
                } else {
                    System.out.println("Incorrect answer to secret question.");
                }
                return;
            }
        }
        System.out.println("User not found.");
    }
    public void start() {
        while (true) {
            System.out.println("\nWelcome to User Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    resetPassword();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}




