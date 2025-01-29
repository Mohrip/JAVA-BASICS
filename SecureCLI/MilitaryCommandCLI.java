package SecureCLI;
import java.util.Scanner;

public class MilitaryCommandCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Military Command System");
        System.out.println("Available Commands: STATUS, ACTIVATE, SHUTDOWN, EXIT");

        while (true) {
            System.out.print("Enter Command: ");
            command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "STATUS":
                    System.out.println("System Status: Operational");
                    break;
                case "ACTIVATE":
                    System.out.println("Activating Military Command System");
                    break;
                case "SHUTDOWN":
                    System.out.println("Shutting Down Military Command System");
                    break;
                case "EXIT":
                    System.out.println("Exiting Military Command System");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Command");
            }
        }



    }
}
