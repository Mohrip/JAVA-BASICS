package smallApps.EncryptionANDDecryption;

// This code must read a ny file I uploud it or hard code the file path then encrypt the file content

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class FileEncryption {

    public static void encryptWitCcb(String filenamePlain, String filenameEncrypted, byte[] key)
            throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException,
                   IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        byte[] iv = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(iv));

        try (FileInputStream fis = new FileInputStream(filenamePlain);
             FileOutputStream fos = new FileOutputStream(filenameEncrypted)) {
             fos.write(iv);
            try (CipherOutputStream cos = new CipherOutputStream(fos, cipher)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                cos.write(buffer, 0, bytesRead);
            }
        }
        }
    }

    public static void decryptWithCbc(String filenameEncrypted, String filenameDecrypted, byte[] key)
            throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        try (FileInputStream fis = new FileInputStream(filenameEncrypted)) {
            byte[] iv = new byte[16];
            if (fis.read(iv) != 16) throw new IOException("Invalid IV length");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKey secretKey = new SecretKeySpec(key, "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv));

            try (FileOutputStream fos = new FileOutputStream(filenameDecrypted);
                 CipherInputStream cis = new CipherInputStream(fis, cipher)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = cis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}