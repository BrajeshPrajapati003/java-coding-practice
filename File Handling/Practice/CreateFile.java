import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        final String fileName = "file.txt";

        try{
            File obj = new File("file.txt");
            if(obj.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File creation failed");
            }
        }catch(Exception e){
            System.err.println(e.toString());
        }
    }
}
