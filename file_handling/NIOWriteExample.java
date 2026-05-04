import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NIOWriteExample {
    public static void main(String[] args) throws IOException {
        Files.writeString(Paths.get("test.txt"), "NIO is powerful.....");
    }
}
