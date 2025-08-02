import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class SkipExample{
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file.txt");){
            long bytesToSkip = 10;
            long bytesSkipped = fis.skip(bytesToSkip);
            System.out.println("Skipped: " + bytesSkipped + " bytes");

            int nextByte = fis.read();
            if(nextByte != -1){
                System.out.println("Next byte: " + (char)nextByte);
            }
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException: " + e.toString());
        }catch(IOException e){
            System.err.println(e.toString());
        }
    }
}