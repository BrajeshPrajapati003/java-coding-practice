import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String sFileName = input.next();
        input.close();
        Scanner sc = null;
        FileInputStream fis = null;
        try{
            FileInputStream FI = new FileInputStream((sFileName));
            sc = new Scanner(FI);

            // This will read data till the end of the data
            while(sc.hasNext()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
