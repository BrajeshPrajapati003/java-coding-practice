
import java.io.File;

public class FileSizeAndPath {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        try {
            File objFile = new File(fileName);
            System.out.println("file Path: " + objFile.getAbsolutePath());
            System.out.println("File Size: " + objFile.length() + " bytes");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
