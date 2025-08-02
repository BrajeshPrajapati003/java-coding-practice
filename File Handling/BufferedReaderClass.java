import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        try {
            File obj = new File(fileName);
            if(!obj.exists()){
                System.out.println("File doesn't exist");
                System.exit(0);
            }
            String text;
            FileReader fileRead = new FileReader(obj.getAbsoluteFile());
            
            try (BufferedReader buffRead = new BufferedReader(fileRead)) {
                // Read text from file
                System.out.println("Content of the file is: ");
                while((text = buffRead.readLine()) != null){
                    System.out.println(text);
                }
            }

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
