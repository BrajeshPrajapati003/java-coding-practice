
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFirst3Lines {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line = "";
        try (LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("file.txt"), "UTF-8"));){
                while(((line = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                    System.out.println(line);
                }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch(IOException e){
            System.err.println("Unable to read the file");
        }
    }
}
