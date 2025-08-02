import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLine2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String sFileName = userInput.nextLine();
        userInput.close();

        try(FileInputStream fis = new FileInputStream(sFileName);
            Scanner fileScanner = new Scanner(fis)){
                
                while(fileScanner.hasNextLine()){
                    String data = fileScanner.nextLine();
                    System.err.println(data);
                }
        }catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.err.println("An I/O occured " + e.getMessage());
            e.printStackTrace();
        }
    }
}
