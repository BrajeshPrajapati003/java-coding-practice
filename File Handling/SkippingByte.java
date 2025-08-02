import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SkippingByte {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileInputStream finput = new FileInputStream(file);){
            int ch;
            System.out.println("File's content after 5 bytes is: ");

            // Skipping 5 bytes to read the file
            finput.skip(5);

            while((ch = finput.read()) != -1){
                System.out.print((char) ch);
            }
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException: " + e.toString());
        }catch(IOException e){
            System.out.println("IOException : " + e.toString());
        }catch(Exception e){
            System.out.println("Exception: " + e.toString());
        }
    }
}
