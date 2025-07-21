package Training.smallApps.registrationApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.InputMismatchException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.*;

public class UserManager {

  private static final Logger logger = Logger.getLogger(UserManager.class.getName());

  static {
    try {
      File logDir = new File ("logs");
      if(!logDir.exists()) {
        logDir.mkdir();
      }

      String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
      String logPath = "logs/app_" + timestamp + ".log";
      FileHandler fh = new FileHandler(logPath);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.setLevel(Level.INFO);
        fh.setLevel(Level.INFO);
    } catch (IOException e) {
        logger.severe("Failed to initialize logger: " + e.getMessage());

    }
    System.setProperty("java.util.logging.SimpleFormatter.format", "%5$s%n");
  }

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
    logger.info("User registered successfully!");
  }

  public void login() {
    System.out.println("Enter username:");
    String username = scanner.nextLine();
    System.out.println("Enter password:");
    String password = scanner.nextLine();
    System.out.println("Enter secret answer:");
    String secretAnswer = scanner.nextLine();

    for (User user : users) {
      if (user.getUsername().equals(username)
          && user.getPassword().equals(password)
          && user.getSecretAnswer().equals(secretAnswer)) {
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
      System.out.println("\nWelcome to User Management System");
      System.out.println("1. Register");
      System.out.println("2. Login");
      System.out.println("3. Reset Password");
      System.out.println("4. Exit");
      System.out.println("Choose an option: ");
      try {
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
            logger.warning("Invalid input. Please enter a number between 1 and 4.");
        }
      } catch (InputMismatchException e) {
        logger.warning("Invalid choice. Please try again.");
        scanner.nextLine();
      }
    }
  }
  }

