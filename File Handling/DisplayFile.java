import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class DisplayFile {
    public static void main(String[] args) throws IOException {
        File fileName = new File("file.txt");

        try (FileInputStream inFile = new FileInputStream("file.txt")) {
            int len = (int) fileName.length();
            
            byte[] bytes = new byte[len];
            System.out.println("Size of File: " + inFile.read(bytes));
            
            String f = new String(bytes);
            System.out.println("File content is: " + f);
        }
    }
}
