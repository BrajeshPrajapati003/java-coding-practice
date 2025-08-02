import java.io.File;
import java.util.Date;

public class FileLastModified {
    public static void main(String[] args) {
        File f = new File("file.txt");
        // lastModified is the predefined function
        long lastModify = f.lastModified();
        System.out.println("File was last modified at: " + new Date(lastModify));
    }
}
