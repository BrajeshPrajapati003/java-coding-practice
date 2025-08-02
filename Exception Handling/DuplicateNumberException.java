import java.util.*;

public class DuplicateNumberException{
    public static void main(String[] args) {
        try{
            List<Integer> numbers = readNumbersFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        }catch(DuplicateNumException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static List<Integer> readNumbersFromUser(){
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to input? ");
        int count = sc.nextInt();

        System.out.println("Input the integers: ");
        for(int i = 0; i< count; i++){
            int num = sc.nextInt();
            numbers.add(num);
        }
        sc.close();
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws DuplicateNumException{
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int num: numbers){
            if(uniqueNumbers.contains(num)){
                throw new DuplicateNumException("Duplicate Number found: "+ num);
            }
            uniqueNumbers.add(num);
        }
    }
}

class DuplicateNumException extends Exception{
    public DuplicateNumException(String message){
        super(message);
    }
}