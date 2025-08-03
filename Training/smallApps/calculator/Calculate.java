package smallApps.calculator;

import java.util.Scanner;

public class Calculate {

    public double addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber + secondNumber;
        System.out.println("The result of addition is: " + result);
        return result;
    }
}
