import java.nio.file.*;

public class DirectoryExample {
    public static void main(String[] args){
        Path path = Paths.get("myFolder");

        if(!Files.exists(path)){
            Files.createDirectory(path);
            System.out.println("Directory created!");
        }
    }
}
