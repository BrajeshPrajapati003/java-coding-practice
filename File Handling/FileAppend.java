
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) {
        String strFile = "file.txt";
        try{
            // File output stream to open and write data
            FileOutputStream f = new FileOutputStream(strFile, true);
            String strContent = "Brajesh Prajapati - 66,43"; // Appended String
            f.write(strContent.getBytes()); // Appending String
            f.close();
            System.out.println("String appended successfully");
        }catch(FileNotFoundException e){
            System.err.println("File not found exception: " + e.toString());
        }catch(IOException e){
            System.err.println("IOException: " + e.toString());
        }catch(Exception e){
            System.err.println("Exception: " + e.toString());
        }
    }
}
