package InDepth.Section4;
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {

        // here i want to use scanner to get the input from the user 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String Days = scanner.nextLine();
        if (Days.equals("Monday")) {
            System.out.println("Today is Monday");
        } else if (Days.equals("Tuesday")) {
            System.out.println("Today is Tuesday");
        } else if (Days.equals("Wednesday")) {
            System.out.println("Today is Wednesday");
        } else if (Days.equals("Thursday")) {
            System.out.println("Today is Thursday");
        } else if (Days.equals("Friday")) {
            System.out.println("Today is Friday");
        } else if (Days.equals("Saturday")) {
            System.out.println("Today is Saturday");
        } else if (Days.equals("Sunday")) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Invalid day");
        }


        //Switch statement
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the day: ");
        String Days1 = scanner1.nextLine();
        switch (Days1) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        scanner.close();
        scanner1.close();

   
    }
    
}
