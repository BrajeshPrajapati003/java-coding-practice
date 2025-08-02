import java.io.File;
import java.io.IOException;
public class CreateNewFile2 {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        try {
            java.io.File obj = new File(fileName);
            if(obj.createNewFile()){
                System.out.println("File created successfully");
            }else{
                System.out.println("File creation failed");
            }
        } catch (IOException e) {
            System.err.println("IOException occured: " + e.getMessage());
        }catch(SecurityException e){
            System.err.println("SecurityException occured: " + e.getMessage());
        }catch(Exception e){
            System.err.println("Unexpected exception occured: " + e.getMessage());
        }
    }
}
