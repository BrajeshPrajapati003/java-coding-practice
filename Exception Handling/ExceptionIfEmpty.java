import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class ExceptionIfEmpty {
    public static void main(String[] args) {
        try{
            checkIfEmpty("test.txt");
            System.out.println("The given file is not empty!");
        }catch(FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(EmptyException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkIfEmpty(String fileName) throws FileNotFoundException, EmptyException{
        File file = new File(fileName);
        Scanner sc = new Scanner(fileName);
        if(!sc.hasNext()){
            throw new EmptyException("File is Empty!!!!!");
        }
        sc.close();
    }
}

class EmptyException extends Exception{
    public EmptyException(String message){
        super(message);
    }
}
