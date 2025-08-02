import java.io.File;
public class FileReadNot {
    public static void main(String[] args) {
        String filePath = "output.txt";
        File f = new File(filePath);
        if(f.canRead()){
            System.out.println("File " + f.getPath() + " can be Read");
        }else{
            System.out.println("File " + f.getPath() + " can't be Read");
        }
    }
}
