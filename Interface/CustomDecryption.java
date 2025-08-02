import java.util.Base64;

interface Decryptor{
    String decrypt(String data);
}

public class CustomDecryption {
    public static void main(String[] args) {
        Decryptor decryptor = data -> new String(Base64.getDecoder().decode(data));

        String encryptedData = "SGVsbG8gNjYgb3IgbXkgd29ybGQhIDEyMw==";
        String decryptedData = decryptor.decrypt(encryptedData);

        System.out.println("Encrypted Data: " + encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
    }
}
