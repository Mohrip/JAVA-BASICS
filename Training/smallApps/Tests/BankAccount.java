package Training.smallApps.Tests;

import  java.util.Scanner;
import  java.util.Arrays;

public class BankAccount {
    private int age;

    public BankAccount() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age:");
    age = sc.nextInt();

    if(age > 21 && age < 55){
        System.out.println("saving account");

    }
    else if (age >= 55){
        System.out.println("senior citizen account");
    }
    else{
        System.out.println("invalid age for account");
    }
}
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
    }
}
