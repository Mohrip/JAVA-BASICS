package smallApps.EncryptionANDDecryption;

import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word to encrypt: ");
            String data = scanner.nextLine();

            SecretKey key = Encryption.generateKey();
            byte[] iv = Encryption.generateIV();


            byte[] encryptedData = Encryption.encrypt(data, key, iv);
            System.out.println("Encrypted Data (Base64): " + java.util.Base64.getEncoder().encodeToString(encryptedData));
            System.out.println("IV (Base64): " + java.util.Base64.getEncoder().encodeToString(iv));

            String decryptedData = Encryption.decrypt(encryptedData, key, iv);
            System.out.println("Decrypted Data: " + decryptedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}