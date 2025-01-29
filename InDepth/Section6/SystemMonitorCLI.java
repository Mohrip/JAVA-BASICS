package InDepth.Section6;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class SystemMonitorCLI {
    public static void main(String[] args) {
        // Implement the System Monitor CLI here
        Scanner scanner = new Scanner(System.in);
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

        System.out.println("System Monitor CLI");
        System.out.println("Available Commands: CPU, MEMORY, EXIT");

        while(true) {
            System.out.print("Enter Command: ");
            String command = scanner.nextLine().toUpperCase();

            switch(command){
                case "CPU":
                    System.out.println("CPU Usage: " + osBean.getSystemLoadAverage());
                    break;

                case "MEMORY":
                Runtime runtime = Runtime.getRuntime();
                long usedMemory = (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
                System.out.println("Memory Usage: " + usedMemory + " MB");
                break;

                case "EXIT":
                System.out.println("Exiting System Monitor CLI");
                return;

                default:
                System.out.println("Invalid Command");





            }
        }


    }
    
}
