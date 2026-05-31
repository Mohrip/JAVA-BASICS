package Training.smallApps.expenseTracker;

import Training.smallApps.taskApp.Task;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {

    private List<Expenses> expenses = new ArrayList<>();
    private final String filePath = "expenses.json";

    public ExpenseTracker() {}

    public void addExpenses(Expenses expenses) {
        this.expenses.add(expenses);
        saveExpenses();
    }

    public void removeExpenses(int id){
        expenses.removeIf(expenses -> expenses.getId() == id);
        saveExpenses();
    }

    private void saveExpenses() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(expenses);
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
            e.printStackTrace();
        }
    }

    public List<Expenses> getExpenses() {
        return expenses;
    }

//    private void loadExpenses(){
//
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
//            expenses = (List<Expenses>) in.readObject();
//        } catch (FileNotFoundException e) {
//            System.out.println("No previous expenses found. Starting fresh.");
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println("Error loading expenses.");
//            e.printStackTrace();
//        }
//
//    }




}

