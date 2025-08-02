public class PrintEvenNumbers {
    public static void main(String[] args) {

        // Print Even numbers
        System.out.println("Even numbers");
        for(int i=2; i<=100; i = i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        // Print Odd numbers
        System.out.println("Odd numbers");
        for(int i=1; i<=100; i = i+2){
            System.out.print(i+" ");
        }
    }
}
