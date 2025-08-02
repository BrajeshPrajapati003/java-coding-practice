import java.io.*;
public class FileSize {
    public static void main(String[] args) {
        File file = new File("file.txt");
        long s = file.length();

        // Print file size in bytes, kilobytes and megabytes
        System.out.println("File size in Bytes: " + (double) s);
        System.out.println("File size in Kilobytes: " + (double) s/1024);
        System.out.println("File size in Megabytes: " + (double) s/(1024*1024));
    }
}
