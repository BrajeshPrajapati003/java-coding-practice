// import java.nio.file.attribute.*;
// import java.nio.file.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.util.Scanner;

public class DosAtrributeFile {
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("Enter the file path: ");
            String f = sc.next();
            Path fPath = FileSystems.getDefault().getPath(f);

            // Create object of dos atrribute
            DosFileAttributeView view = Files.getFileAttributeView(fPath, DosFileAttributeView.class);

            // Read the attribute of dos file
            DosFileAttributes attr = view.readAttributes();

            System.out.println("isArchive: " + attr.isArchive());
            System.out.println("isHidden: " + attr.isHidden());
            System.out.println("isReadOnly: " + attr.isReadOnly());
            System.out.println("isSystem: " + attr.isSystem());
        }
    }
}
