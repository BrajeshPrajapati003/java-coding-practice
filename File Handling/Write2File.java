
import java.io.FileWriter;
import java.io.IOException;

public class Write2File{
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt")){
            writer.write("Brajesh Prajapati - 66!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}