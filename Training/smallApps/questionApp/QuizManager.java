package Training.smallApps.questionApp;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    public QuizManager() {

        questions.add(new Question("What is the size of byte in Java?",
                List.of("1 bit", "8 bits", "16 bits", "32 bits"),
                "8 bits",
                "A byte is 8 bits in Java."));
        questions.add(new Question("Which of the following is not a Java keyword?",
                List.of("class", "interface", "extends", "implements"),
                "extends",
                "In Java, 'extends' is used to inherit from a class, but it is not a keyword on its own. The correct keyword is 'class'."));
        questions.add(new Question("What is the default value of a boolean variable in Java?",
                List.of("true", "false", "null", "0"),
                "false",
                "In Java, the default value of a boolean variable is false."));
        questions.add(new Question("Which of the following is a valid declaration of an array in Java?",
                List.of("int[] arr;", "int arr[];", "int arr[10];", "Both A and B"),
                "Both A and B",
                "In Java, both 'int[] arr;' and 'int arr[];' are valid ways to declare an array."));
        questions.add(new Question("What is the purpose of the 'final' keyword in Java?",
                List.of("To declare a constant", "To prevent method overriding", "To prevent inheritance", "All of the above"),
                "All of the above",
                "The 'final' keyword in Java can be used to declare constants, prevent method overriding, and prevent inheritance of classes."));
        questions.add(new Question( "What is the output of the following code?\nint x = 10;\nSystem.out.println(x++);",
                List.of("10", "11", "Compilation error", "Runtime error"),
                "10",
                "The post-increment operator (x++) returns the value before incrementing, so it prints 10."));
        questions.add(new Question("Which of the following is a valid way to create a string in Java?",
                List.of("String str = 'Hello';", "String str = \"Hello\";", "String str = new String('Hello');", "Both A and B"),
                "Both A and B",
                "In Java, strings can be created using double quotes (\"Hello\") or single quotes with the String constructor (new String('Hello'))."));
        questions.add(new Question("What is the purpose of the 'static' keyword in Java?",
                List.of("To declare a class variable", "To declare a method that belongs to the class", "To declare a constant", "Both A and B"),
                "Both A and B",
                "The 'static' keyword in Java is used to declare class variables and methods that belong to the class rather than instances of the class."));
        questions.add(new Question("What is the output of the following code?\nint a = 5;\nint b = 10;\nSystem.out.println(a + b);",
                List.of("5", "10", "15", "Compilation error"),
                "15",
                "The code adds the values of a and b, which results in 15."));
        questions.add(new Question("Which of the following is a valid way to declare a method in Java?",
                List.of("void myMethod()", "int myMethod(int a)", "String myMethod(String s)", "All of the above"),
                "All of the above",
                "In Java, methods can be declared with different return types and parameters, so all options are valid."));
        questions.add(new Question("What is the purpose of the 'this' keyword in Java?",
                List.of("To refer to the current object", "To refer to the parent class", "To refer to a static variable", "None of the above"),
                "To refer to the current object",
                "The 'this' keyword in Java is used to refer to the current object instance within a class."));
        questions.add(new Question("What is the output of the following code?\nString str = \"Hello\";\nSystem.out.println(str.length());",
                List.of("4", "5", "6", "Compilation error"),
                "5",
                "The length() method returns the number of characters in the string, which is 5 for \"Hello\"."));
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Quiz! Answer the following questions:");

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Your answer (1-" + options.size() + "): ");
            int answerIndex = scanner.nextInt() - 1;

            if (answerIndex >= 0 && answerIndex < options.size()) {
                String selectedAnswer = options.get(answerIndex);
                if (selectedAnswer.equals(question.getCorrectAnswer())) {
                    score++;
                    System.out.println("Correct! " + question.getExplanation());
                } else {
                    System.out.println("Incorrect. " + question.getExplanation());
                }
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
        scanner.close();
    }




}
