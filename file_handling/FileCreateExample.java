
import java.io.File;
import java.io.IOException;

public class FileCreateExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");

            if(file.createNewFile()){
                System.out.println("File created..." + file.getName());
            }else{
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.err.println("Error occurred!");
            e.getMessage();
        }
    }
}
