
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class StoreVariable2 {
    public static void main(String[] args) {
        String data = "";
        try(BufferedReader buffRead = new BufferedReader(new FileReader("file.txt"));){
            String line;
            while((line = buffRead.readLine()) != null){
                data += line + System.lineSeparator(); // Add line and new line
            }
            System.out.println(data);
        }catch(FileNotFoundException e){
            System.err.println("File not found");
        }catch(IOException e){
            System.err.println("Unable to read the file");
        }
    }
}
