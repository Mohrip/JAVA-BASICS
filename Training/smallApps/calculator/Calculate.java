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

    public double subtraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber - secondNumber;
        System.out.println("The result of subtraction is: " + result);
        return result;
    }

    public double multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber * secondNumber;
        System.out.println("The result of multiplication is: " + result);
        return result;
    }

    public double division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        if (secondNumber == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        double result = firstNumber / secondNumber;
        System.out.println("The result of division is: " + result);
        return result;
    }
}
