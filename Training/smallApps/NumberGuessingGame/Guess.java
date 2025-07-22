package smallApps.NumberGuessingGame;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Guess {
  private int lowerBound;
  private int upperBound;
  private int targetNumber;
  private List<Integer> guesses = new ArrayList<>();

  public Guess(int lowerBound, int upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
    this.targetNumber = generateRandomNumber(lowerBound, upperBound);
  }

  public void setBounds() {
    System.out.println("Welcome to the Number Guessing Game!");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter lower bound:");
    this.lowerBound = Integer.parseInt(scanner.nextLine());
    System.out.println("Enter upper bound:");
    this.upperBound = Integer.parseInt(scanner.nextLine());
    this.targetNumber = generateRandomNumber(lowerBound, upperBound);
    System.out.println(
        "New bounds set. The target number is now between "
            + lowerBound
            + " and "
            + upperBound
            + ".");

    while (true) {
      try {
        int guess = Integer.parseInt(scanner.nextLine());
        guesses.add(guess);
        checkGuess(guess);

        if (guess == targetNumber) {
          break;
        }
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid integer.");
      }
    }
    System.out.println("Your guesses: " + guesses);
    scanner.close();
  }

  private int generateRandomNumber(int lowerBound, int upperBound) {
    Random random = new Random();
    return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
  }

  private void checkGuess(int guess) {
    if (guess == targetNumber) {
      System.out.println("Congratulations! You've guessed the number: " + targetNumber);
    } else if (guess < targetNumber) {
      System.out.println("Your guess is too low. Try again.");
    } else {
      System.out.println("Your guess is too high. Try again.");
    }
  }
}
