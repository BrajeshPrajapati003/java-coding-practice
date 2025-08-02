import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class IfFileNotFoundException {
    public static void main(String[] args) {
        try{
            readFile("test.txt");
        }catch(FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        //Read and process the contents of the file
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}
