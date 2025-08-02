import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class CheckEmptyFile{
    public static void main(String[] args) {
        try{
            checkEmptyFile("test2.txt");
            System.out.println("File is not empty!");
        }catch(FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(CheckEmptyFileException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkEmptyFile(String fileName) throws FileNotFoundException, CheckEmptyFileException{
        File file = new File(fileName);
        Scanner sc = new Scanner(fileName);
        if(sc.hasNext()){
            throw new CheckEmptyFileException("The given file is empty :(");
        }
        sc.close();
    }
}

class CheckEmptyFileException extends Exception{
    CheckEmptyFileException(String message){
        super(message);
    }
}