
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOReadExample {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Paths.get("test.txt"));
        System.out.println(content);
    }
}
