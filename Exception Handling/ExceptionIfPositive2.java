import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ExceptionIfPositive2{
    public static void main(String[] args) {
        try{
            checkPositiveNumber("test2.txt");
            System.out.println("All numbers are non-positive!");
        }catch(FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(PositiveNumbException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkPositiveNumber(String fileName) throws FileNotFoundException, PositiveNumbException{
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            int number = Integer.parseInt(sc.nextLine());
            if(number>0){
                throw new PositiveNumbException("Positive number "+ number +" found!");
            }
        }
        sc.close();
    }
}

class PositiveNumbException extends Exception{
    public PositiveNumbException(String message){
        super(message);
    }
}