import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
    public static void main(String[] args) {
        try {
            FileInputStream srcFile = new FileInputStream(args[0]); // i/p file
            FileOutputStream newFile = new FileOutputStream(args [1]); // o/p file
            int byteVal;

            // Read from first file and write to second file
            while((byteVal = srcFile.read()) != -1){
                newFile.write(byteVal);
            }

            srcFile.close();
            newFile.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.err.println("Exception: " + e.toString());
        }
    }
}
