
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteRead {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String line = "";
        try{
            String fileName = "file.txt";
            try (FileWriter fw = new FileWriter(fileName, false)) {
                // append: false(opens the file in write mode, overwriting any existing content)
                fw.write("Brajesh Prajapati performing File Handling in java");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
                // Read the file content
                while (line != null) {
                    builder.append(line);
                    builder.append(System.lineSeparator());
                    line = reader.readLine();
                    System.out.println(line);
                }
            }
        }catch(IOException e){
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
