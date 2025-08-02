import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTextCorrected2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try(BufferedReader buffRead = new BufferedReader(new FileReader("file.txt"));){
            String str;
            while((str = buffRead.readLine()) != null){
                list.add(str);
            }
            System.out.println(Arrays.toString(list.toArray()));
        }catch(IOException e){
            System.err.println("Unable to read the file.");
        }
    }
}
