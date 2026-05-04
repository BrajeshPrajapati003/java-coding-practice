
import java.io.FileWriter;
import java.io.IOException;

// package file_handling;

public class FileWriteExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello Brajesh\nLearning Java file handling....");
            writer.close();

            System.out.println("Successfully written!");

        }catch(IOException e){
            System.out.println("Error occurred!");
            e.printStackTrace();
        }
    }
}
