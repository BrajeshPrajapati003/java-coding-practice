
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrittenDataSize {
    public static void main(String[] args) {
        try{
            final String fileName = "file.txt";
            File obj = new File(fileName);
            try (// Open the specified file. If doesn't exist, it will be created
                FileOutputStream fileOutput = new FileOutputStream(obj); 
                // To write primitive Java data types (int, double,..) in a portable binary format
                DataOutputStream dataOutput = new DataOutputStream(fileOutput);) {
                dataOutput.writeBytes("This is Brajesh Prajapati");
                int bytesWritten = dataOutput.size();
                System.out.println("Total " + bytesWritten + " bytes are written to Stream");
            }
        }catch(IOException e){
            System.err.println("Exception:  "+e.toString());
        }
    }
}
