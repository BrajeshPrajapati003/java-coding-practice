import java.util.*;

public class DuplicateNumberException2 {
    public static void main(String[] args) {
        try{
            List<Integer> numbers = readFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers found...");
        }catch(DuplicateFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static List<Integer> readFromUser(){
        System.out.println("How many inputs do you want? ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        System.out.println("Enter the integers: ");
        for(int i=0; i<count; i++){
            int n = sc.nextInt();
            num.add(n);
        }
        sc.close();
        return num;
    }

    public static void checkDuplicates(List<Integer> number) throws DuplicateFoundException{
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int n: number){
            if(uniqueNumbers.contains(n)){
                throw new DuplicateFoundException("Duplicate number found!!!!"+ n);
            }
            uniqueNumbers.add(n);
        }
    }
}

class DuplicateFoundException extends Exception{
    public DuplicateFoundException(String message){
        super(message);
    }
}
