import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        sc.close(); // close the scanner, but not System.in

        try(FileInputStream fis = new FileInputStream(fileName); Scanner fileScanner = new Scanner(fis)){
            while(fileScanner.hasNextLine()){
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace(); // For debugging
        }
    }
}
