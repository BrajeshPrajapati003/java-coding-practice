
import java.io.FileReader;
import java.io.IOException;



public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
            int character;

            while((character = reader.read()) != -1){ // read() returns ASCII int, -1 = end of file
                System.out.println((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error occurred!");
            e.printStackTrace();
        }
    }
}
