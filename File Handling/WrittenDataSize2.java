import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrittenDataSize2 {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        File obj = new File(fileName);

        FileOutputStream fileOutput = null;
        DataOutputStream dataOutput = null;

        try {
            fileOutput = new FileOutputStream(obj);
            dataOutput = new DataOutputStream(fileOutput);

            dataOutput.writeBytes("This is Brajesh Prajapati");
            int bytesWritten = dataOutput.size();
            System.out.println("Total " + bytesWritten + " bytes are written to Stream");
        } catch (IOException e) {
            System.err.println("IOException: " + e.toString());
        }finally{
            if(dataOutput != null){
                try {
                    dataOutput.close();
                } catch (IOException e) {
                    System.err.println("Error closing DataOutputStream: " + e.toString());
                }
            }
            if(fileOutput != null){
                try {
                    fileOutput.close();
                } catch (IOException e) {
                    System.err.println("Error closing FileOutputStream: " + e.toString());
                }
            }
        }
    }
}
