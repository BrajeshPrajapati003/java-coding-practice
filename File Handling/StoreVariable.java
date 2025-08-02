
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoreVariable {
    public static void main(String[] args) {
        String line = "";
        String data = "";

        try(BufferedReader buffRead = new BufferedReader(new FileReader("file.txt"));){
            while(line != null){
                data += line;
                line = buffRead.readLine();
            }
            System.out.println(data);
        }catch(FileNotFoundException e){
            System.err.println("File not found");
        }catch(IOException e){
            System.err.println("Unable to read the file");
        }
    }
}
