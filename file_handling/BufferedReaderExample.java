
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// package file_handling;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
