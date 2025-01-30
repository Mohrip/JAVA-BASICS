package SecureCLI;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Scanner;

public class MilitarySecCLI {
    private static final String USERNAME = "Commander";
    private static final String PASSWORD = "SecurePass123";
    private static SecretKey secretKey;
    private static final String LOG_FILE = "military_log.txt";

    public static void main(String[] args) throws Exception {
        if (!authenticateUser()) {
            System.out.println("Unauthorized access attempt detected. Logging out...");
            return;
        }
        logEvent("User logged in successfully.");
        initializeEncryption();
        startCLI();
    }

    private static boolean authenticateUser() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter Password: ");
            String inputPassword = scanner.nextLine();
            return USERNAME.equals(inputUsername) && PASSWORD.equals(inputPassword);
        }
    }

    private static void initializeEncryption() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        secretKey = keyGenerator.generateKey();
    }

    private static void startCLI() {
        try (Scanner scanner = new Scanner(System.in)) {
            OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
            
            System.out.println("\nWelcome, Commander. You may issue commands.");
            System.out.println("Available Commands: STATUS, MONITOR, ENCRYPT <message>, DECRYPT <message>, LOGS, EXIT");
            
            while (true) {
                System.out.print("Enter command: ");
                String input = scanner.nextLine();
                logEvent("Command executed: " + input);
                
                if (input.equalsIgnoreCase("EXIT")) {
                    System.out.println("Logging out...");
                    logEvent("User logged out.");
                    break;
                }
                
                switch (input.toUpperCase().split(" ")[0]) {
                    case "STATUS":
                        System.out.println("System Status: All systems operational.");
                        break;
                    case "MONITOR":
                        System.out.println("CPU Load: " + osBean.getSystemLoadAverage());
                        System.out.println("Memory Usage: " + getMemoryUsage() + " MB");
                        break;
                    case "ENCRYPT":
                        handleEncryption(input.substring(8));
                        break;
                    case "DECRYPT":
                        handleDecryption(input.substring(8));
                        break;
                    case "LOGS":
                        displayLogs();
                        break;
                    default:
                        System.out.println("Unknown command.");
                }
            }
        }
    }
    
    private static long getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024);
    }

    private static void handleEncryption(String message) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(message.getBytes());
            String encryptedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted Message: " + encryptedMessage);
        } catch (Exception e) {
            System.out.println("Encryption failed.");
        }
    }

    private static void handleDecryption(String encryptedMessage) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
            System.out.println("Decrypted Message: " + new String(decryptedBytes));
        } catch (Exception e) {
            System.out.println("Decryption failed.");
        }
    }

    private static void logEvent(String event) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write("[" + timestamp + "] " + event + "\n");
        } catch (IOException e) {
            System.out.println("Failed to write to log file.");
        }
    }

    private static void displayLogs() {
        try {
            String logs = new String(Files.readAllBytes(Paths.get(LOG_FILE)));
            System.out.println("System Logs:\n" + logs);
        } catch (IOException e) {
            System.out.println("No logs available.");
        }
    }
}
