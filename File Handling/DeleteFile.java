import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        File obj = new File(fileName);

        // Check file exists or not, if exists delete it
        if(obj.exists()){
            if(obj.delete()) System.out.println("File Deleted");
            else System.out.println("File deletion failed");
        }else{
            System.out.println("File doesn't exist");
        }
    }
}
