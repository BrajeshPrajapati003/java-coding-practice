import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StoreText {
    public static void main(String[] args) {
        StringBuilder strBuil = new StringBuilder();
        String str = "";
        List<String> list = new ArrayList<>();
        try(BufferedReader buffRead = new BufferedReader(new FileReader("file.txt"));){
            while(str != null){
                str = buffRead.readLine();
                strBuil.append(str);
                strBuil.append(System.lineSeparator());
                str = buffRead.readLine();
                if(str == null) break;
                list.add(str);
            }
            System.out.println(Arrays.toString(list.toArray()));
            buffRead.close();
        }catch(IOException e){
            System.err.println("Unable to read the file.");
        }
    }
}
