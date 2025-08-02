import java.io.File;
public class CheckFile {
    public static void main(String[] args) {
        File file = new File("file.text");
        boolean res = file.isHidden(); // Check file is hidden or not

        // Return result in true of false
        System.out.println("Is the file " + file.getPath() + " hidden?: " + res);
    }
}
