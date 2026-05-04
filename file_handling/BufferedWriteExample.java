
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// package file_handling;

public class BufferedWriteExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));

        bw.write("Fast writing using buffer...");
        bw.newLine();
        bw.close();
    }
}
