import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        try{
            File obj = new File(fileName);
            if(obj.createNewFile()){
                System.out.println("File created Successfully...");
            }else{
                System.out.println("File creation failed...");
            }
        }catch(Exception ex){
            System.out.println("Exception: " + ex.toString());
        }
    }
}