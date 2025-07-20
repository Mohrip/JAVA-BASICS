package Training.smallApps.registrationApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class UserManager {

  private static final Logger logger = Logger.getLogger(UserManager.class.getName());
  static {

   System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
  }
  private List<User> users = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  public void register() {
    logger.info("Enter username:");
    String username = scanner.nextLine();
    logger.info("Enter password:");
    String password = scanner.nextLine();
    logger.info("Enter email:");
    String email = scanner.nextLine();
    logger.info("Enter secret question:");
    String secretQuestion = scanner.nextLine();
    logger.info("Enter secret answer:");
    String secretAnswer = scanner.nextLine();

    users.add(new User(username, password, secretQuestion, secretAnswer, email));
    logger.info("User registered successfully!");
  }

  public void login() {
    logger.info("Enter username:");
    String username = scanner.nextLine();
    logger.info("Enter password:");
    String password = scanner.nextLine();
    logger.info("Enter secret answer:");
    String secretAnswer = scanner.nextLine();

    for (User user : users) {
      if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getSecretAnswer().equals(secretAnswer)) {
        logger.info("Login successful!");
        return;
      }
    }
    logger.warning("Invalid username or password.");
  }

  public void resetPassword() {
    logger.info("Enter your username:");
    String username = scanner.nextLine();

    for (User user : users) {
      if (user.getUsername().equals(username)) {
        logger.info("Answer your secret question: " + user.getUsername());
        String answer = scanner.nextLine();
        if (user.getSecretAnswer().equals(answer)) {
          logger.info("Enter new password:");
          String newPassword = scanner.nextLine();
          user.setPassword(newPassword);
          logger.info("Password reset successfully!");
        } else {
          logger.warning("Incorrect answer to secret question.");
        }
        return;
      }
    }
    logger.warning("User not found.");
  }

  public void start() {
    while (true) {
      logger.info("\nWelcome to User Management System");
      logger.info("1. Register");
      logger.info("2. Login");
      logger.info("3. Reset Password");
      logger.info("4. Exit");
      logger.info("Choose an option: ");
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
          logger.info("Exiting...");
          return;
        default:
          logger.warning("Invalid choice. Please try again.");
      }
    }
  }
}
