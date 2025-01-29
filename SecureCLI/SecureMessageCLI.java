package SecureCLI;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Scanner;

public class SecureMessageCLI {
    private static SecretKey secretKey;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        secretKey = keyGenerator.generateKey();

        System.out.println("Secure Communication CLI");
        System.out.println("Commands: ENCRYPT <message>, DECRYPT <message>, EXIT");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("Exiting Secure CLI.");
                break;
            }

            String[] parts = input.split(" ", 2);
            if (parts.length < 2) {
                System.out.println("Invalid command format.");
                continue;
            }

            String command = parts[0].toUpperCase();
            String message = parts[1];

            if (command.equals("ENCRYPT")) {
                String encrypted = encrypt(message);
                System.out.println("Encrypted Message: " + encrypted);
            } else if (command.equals("DECRYPT")) {
                String decrypted = decrypt(message);
                System.out.println("Decrypted Message: " + decrypted);
            } else {
                System.out.println("Unknown command.");
            }
        }
    }

    private static String encrypt(String message) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedMessage) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
        return new String(decryptedBytes);
    }
}
