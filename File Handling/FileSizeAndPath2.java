import java.io.File;

public class FileSizeAndPath2 {
    public static void main(String[] args) {
        final String fileName = "file.txt";
        try {
            File objFile = new File(fileName);
            if(objFile.exists()){
                System.out.println("File Path: " + objFile.getAbsolutePath());
                System.out.println("File Size: " + objFile.length());
            }
        } catch (SecurityException e) {
            System.err.println("Security Exception: " + e.getMessage());
        }catch(NullPointerException e){
            System.err.println("Null Pointer Exception " + e.getMessage());
        }catch(Exception e){
            System.err.println("Exception: " + e.getMessage());
            // e.printStackTrace();
        }
    }
}

/*
 * e.printStackTrace() method is generally discouraged in production code due to its limitations.
 * 
 * Here's how to address those warnings and improve the error handling code:
 *  1. Using a logging framework like SLF4j and Log4j (or logback) - (recommended)
 *  2. If you are just writing small programs, and do not want to add external dependencies, you can remove the printStackTrace, and just print the error message.
 */