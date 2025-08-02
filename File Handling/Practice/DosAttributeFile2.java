import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;
public class DosAttributeFile2 {
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the file path: ");
            String filePathString = sc.next();
            Path fPath = FileSystems.getDefault().getPath(filePathString);

            // Create object of the DOS attribute
            DosFileAttributeView view = Files.getFileAttributeView(fPath, DosFileAttributeView.class);

            DosFileAttributes attr = view.readAttributes();

            System.out.println("isHidden: " + attr.isHidden());
            System.out.println("isSystem: " + attr.isSystem());
            System.out.println("isArchive: " + attr.isArchive());
            System.out.println("isReadOnly: " + attr.isReadOnly());

        }
    }
}
