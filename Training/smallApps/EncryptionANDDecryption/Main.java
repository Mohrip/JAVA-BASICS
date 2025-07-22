package smallApps.EncryptionANDDecryption;

import javax.crypto.SecretKey;
import javax.swing.*;
import java.io.File;
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


            String inputFile = "C:\\Users\\m.alsaif\\Desktop\\test22\\test-enc.txt";
            String encryptedFile = "C:\\Users\\m.alsaif\\Desktop\\test22\\test-enc.enc";
           // String decryptedFile = "";
            byte[] fileKey = "12345678901234561234567890123456".getBytes("UTF-8");

            FileEncryption.encryptWitCcb(inputFile, encryptedFile, fileKey);
           // FileEncryption.decryptWithCbc(encryptedFile, decryptedFile, fileKey);
            System.out.println("Hardcoded file encrypted and decrypted.");

            // 3. File encryption/decryption with file chooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select a file to encrypt");
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String userEncrypted = selectedFile.getParent() + File.separator + "user_encrypted.enc";
                String userDecrypted = selectedFile.getParent() + File.separator + "user_decrypted" + getFileExtension(selectedFile);

                FileEncryption.encryptWitCcb(selectedFile.getAbsolutePath(), userEncrypted, fileKey);
                FileEncryption.decryptWithCbc(userEncrypted, userDecrypted, fileKey);
                System.out.println("Selected file encrypted and decrypted.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndex = name.lastIndexOf('.');
        return (lastIndex == -1) ? "" : name.substring(lastIndex);
    }
}