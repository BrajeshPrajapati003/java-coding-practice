import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("D:/SampleDirectory JAVA");
        boolean isDirectoryCreated = dir.mkdir();
        if(isDirectoryCreated) System.out.println("Directory created");
        else System.out.println("Directory couldn't be created");
    }
}
