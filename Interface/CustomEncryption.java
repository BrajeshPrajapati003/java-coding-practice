
import java.util.Base64;

interface Encryptor{
    String encrypt(String data);
}

public class CustomEncryption {
    public static void main(String[] args) {
        Encryptor encryptor = data -> Base64.getEncoder().encodeToString(data.getBytes());

        String originalData = "Hello 66 or my world! 123";
        String encryptedData = encryptor.encrypt(originalData);

        System.out.println("Original Data: " + originalData);
        System.out.println("Encrypted DAta: " + encryptedData);
    }
}
